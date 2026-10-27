package com.ohgiraffers.requestmapping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/*
* @RestController: @Controller와 @ResponseBody의 기능을 합친 것이다.
* 이 컨트롤러의 모든 핸들러 메서드는 화면(View)를 반환하는 대신,
* 반환 값을 직접 HTTP 응답 본문(JSON 형식)으로 만들어 클라이언트에게 전달한다.
* */
@RestController
@RequestMapping("/api/v1/menus")    // 클래스의 공통 주소 지정
public class MethodMappingTestController {

    // HTTP 요청과 연결되어 실제로 실행되는 Controller 메서드를 핸들러 메서드라고 부른다.
    @GetMapping
    public ResponseEntity<Map<String, String>> findMenus() {
        Map<String, String> response
                = Map.of("message", "메뉴 목록 조회용 핸들러 메서드 호출");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{menuCode}")
    public ResponseEntity<Map<String, Object>> findMenu(
            @PathVariable int menuCode) {

        Map<String, Object> response = Map.of(
                "message", menuCode + "번 메뉴 조회용 핸들러 메서드 호출");

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> registMenu() {
        Map<String, String> response = Map.of("message", "신규 메뉴 등록용 핸들러 메서드 호출");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{menuCode}")
    public ResponseEntity<Map<String, String>> modifyMenu(
            @PathVariable int menuCode) {
        Map<String, String> response = Map.of("message", menuCode + "번 메뉴 수정용 핸들러 메서드 호출");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{menuCode}")
    public ResponseEntity<Map<String, String>> deleteMenu(
            @PathVariable int menuCode) {
        Map<String, String> response = Map.of("message", menuCode + " 번 메뉴 삭제용 핸들러 메서드 호출");
        return ResponseEntity.ok(response);
    }

}
