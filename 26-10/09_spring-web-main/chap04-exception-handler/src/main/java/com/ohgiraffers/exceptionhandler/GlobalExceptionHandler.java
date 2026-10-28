package com.ohgiraffers.exceptionhandler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/* Controller 처리 중 발생한 예외를 공통으로 관찰하고,
 * Handler의 반환값을 HTTP 응답 본문으로 보낼 수 있게 한다. */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /* 예상치 못한 500 오류의 실제 원인은 서버 로그에 남긴다.
     * Logger : 프로그램 실행 중 발생한 정보를 기록하는 객체
     * */
    private static final Logger log
            = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /* @ExceptionHandler는 예외 타입에 맞는 메서드를 선택하여 JSON 실패 응답으로 바꾼다. */
    @ExceptionHandler(MemberNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleMemberNotFound(
            MemberNotFoundException exception, WebRequest request) {

        /* 조회 대상이 없을 때는 서버 오류 (500)이 아니라 리소스 없음인 404로 응답. */
        ErrorResponse response = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                exception.getMessage(),
                extractPath(request)
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

    private String extractPath(WebRequest request) {
        return request.getDescription(false).replace("uri=", "");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handelMethodArgumentNotValid(
            MethodArgumentNotValidException exception, WebRequest request) {

        String message = exception.getBindingResult()
                .getFieldErrors()
                .stream()
                .findFirst()
                .map(error -> error.getDefaultMessage())
                .orElse("요청 값이 올바르지 않습니다");

        ErrorResponse response = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                message,
                extractPath(request)
        );
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(InvalidMemberRequestException.class)
    public ResponseEntity<ErrorResponse> handleInvalidMemberRequest(
            InvalidMemberRequestException exception, WebRequest request) {

        ErrorResponse response = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                exception.getMessage(),
                extractPath(request)
        );
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ErrorResponse> handleNotReadable(
            HttpMessageNotReadableException exception, WebRequest request) {

        ErrorResponse response = new ErrorResponse(
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                "요청 본문 형식이 올바르지 않습니다.",
                extractPath(request)
        );
        return ResponseEntity.badRequest().body(response);
    }

    @GetMapping("/server-error")
    public ResponseEntity<Void> serverError() {
        throw new IllegalStateException("회원 통계 서비스에 연결할 수 없습니다.");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handelException(
            Exception exception, WebRequest request) {

        log.error("처리하지 못한 예외가 발생했습니다", exception);

        ErrorResponse response = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                "서버 내부 오류가 발생했습니다.",
                extractPath(request)
        );
        return ResponseEntity.internalServerError().body(response);
    }

}
