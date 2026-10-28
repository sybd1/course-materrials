package com.ohgiraffers.handlermethod;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuRequestController {

    @GetMapping
    /*
     * name은 Query String에서 찾을 이름이며, 생략하면 Java 매개변수명을 사용한다.
     * required = false는 누락 시 null, defaultValue는 누락 시 기본값을 전달한다.
     * */
    public ResponseEntity<Map<String, Object>> findMenus(
            @RequestParam(name = "keyword", required = false) String keyword,
            @RequestParam(name = "categoryCode", defaultValue = "0") int categoryCode,
            @RequestParam(name = "page", defaultValue = "1") int page) {

        // Keyword가 null일 수 있으므로 null을 허용하는 LinkedHashMap 사용.
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "메뉴 목록 조회 요청 파라미터 확인");
        response.put("keyword", keyword);
        response.put("categoryCode", categoryCode);
        response.put("page", page);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/search")
    public ResponseEntity<Map<String, Object>> searchMenus(
            @RequestParam Map<String, String> parameters) {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "검색 조건 전체 확인");
        response.put("parameter", parameters);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{menuCode}")
    public ResponseEntity<Map<String, Object>> findMenu(@PathVariable("menuCode") int menuCode) {
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", menuCode + "번 메뉴 조회 요청");
        response.put("menuCode", menuCode);

        return ResponseEntity.ok(response);
    }

    /*
    * Application/json 본문을 프로퍼티 이름이 같은 MenuDTO로 변환한다.
    * 빈 본문이나 잘못된 JSON은 400, 지원하지 않는 Content-type은 415가 발생할 수 있다.
    */
    @PostMapping
    public ResponseEntity<Map<String, Object>> createMenu(@RequestBody MenuDTO menu) {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "메뉴 등록 요청 성공");
        response.put("menu", menu);

        // 등록 요청이므로 응답 본문과 201 Created를 반환
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /*
    * String 타입의 @RequestBody는 변환하지 않은 본문을 받는다.
    * @RequestHeader는 지정한 Header를 찾으며, 기본적으로 필수이다.
    * */
    @PostMapping("/raw")
    public ResponseEntity<Map<String, Object>> readRawBody(
            @RequestBody String body,
            @RequestHeader("content-type") String contentType) {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "요청 본문 문자열 확인");
        response.put("contentType", contentType);
        response.put("body", body);

        return ResponseEntity.ok(response);
    }

    @GetMapping("request-info")
    public ResponseEntity<Map<String, Object>> requestInfo(
            @RequestHeader(value = "user-agent", required = false) String userAgent,
            @RequestHeader Map<String, String> headers,
            @CookieValue(value = "clientId", required = false) String clientId) {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "요청 헤더와 쿠키 확인");
        response.put("userAgent", userAgent);
        response.put("clientId", clientId);
        response.put("headerCount", headers.size());

        return ResponseEntity.ok(response);
    }

}
