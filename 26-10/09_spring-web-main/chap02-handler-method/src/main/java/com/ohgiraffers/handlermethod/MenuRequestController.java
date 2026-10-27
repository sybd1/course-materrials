package com.ohgiraffers.handlermethod;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuRequestController {

    @GetMapping
    public ResponseEntity<Map<String, Object>> findMenus(
            @RequestParam(name = "keyword", required = false) String keyword,
            @RequestParam(name = "categoryCode", defaultValue = "0") int categoryCode,
            @RequestParam(name = "page", defaultValue = "1") int page) {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "메뉴 목록 조회 요청 파라미터 확인");
        response.put("keyword", keyword);
        response.put("categoryCode", categoryCode);
        response.put("page", page);

        return ResponseEntity.ok(response);
    }
}
