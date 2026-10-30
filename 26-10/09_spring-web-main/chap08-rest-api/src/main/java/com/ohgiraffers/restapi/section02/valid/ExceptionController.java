package com.ohgiraffers.restapi.section02.valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> methodValidException(MethodArgumentNotValidException e) {

        String code = "";
        String description = "";

        FieldError fieldError = e.getBindingResult().getFieldError();

        String detail = fieldError != null ? fieldError.getDefaultMessage() : "요청 값을 확인해주세요.";
        String bindResultCode = fieldError != null ? fieldError.getCode() : "";

        switch (bindResultCode) {
            case "NotBlank", "NotNull":
                code = "ERROR_CODE_00001";
                description = "필수 값이 누락되었거나 공백입니다.";
                break;
            case "Size":
                code = "ERROR_CODE_00002";
                description = "글자 수를 확인해주세요";
                break;
            default:
                code = "ERROR_CODE_99999";
                description = "요청 값 검증에 실패했습니다.";
        }

        ErrorResponse errorResponse = new ErrorResponse(code, description, detail);

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserException(UserNotFoundException e) {
        String code = "ERROR_CODE_0000";
        String description = "회원 정보 조회 실패";
        String detail = e.getMessage();

        ErrorResponse errorResponse = new ErrorResponse(code, description, detail);

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
