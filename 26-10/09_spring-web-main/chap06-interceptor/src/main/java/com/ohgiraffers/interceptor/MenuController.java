package com.ohgiraffers.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MenuController {

    /*
     * Interceptor 동작 확인이 목적이므로 DB는 연결하지 않는다.
     * 서버 실행 중에만 유지되는 메모리 목록으로 테스트한다.
     */

    /* DB 대신 Interceptor 동작 확인용 메모리 메뉴 목록을 사용한다. */
    private final List<MenuDTO> menus = new ArrayList<>();

    public MenuController() {
        menus.add(new MenuDTO(1, "아메리카노", 3000));
        menus.add(new MenuDTO(2, "카페라떼", 4000));
        menus.add(new MenuDTO(3, "바닐라라떼", 4500));
    }

    @GetMapping("/menus")
    public ResponseEntity<List<MenuDTO>> findMenus() throws InterruptedException {
        /*
         * StopwatchInterceptor의 처리 시간 측정 결과가 눈에 보이도록 일부러 지연을 만든다.
         * 실제 프로젝트 코드에는 이런 지연 코드를 넣지 않는다.
         */
        Thread.sleep(300);
        return ResponseEntity.ok(menus);
    }

    @GetMapping("/menus/{menuCode}")
    public ResponseEntity<MenuDTO> findMenu(@PathVariable int menuCode) throws InterruptedException {
        /* 단건 조회도 처리 시간 측정 차이를 확인하기 위해 짧게 지연시킨다. */
        Thread.sleep(200);

        MenuDTO foundMenu = menus.stream()
                .filter(menu -> menu.getMenuCode() == menuCode)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(menuCode + "번 메뉴가 없습니다."));

        return ResponseEntity.ok(foundMenu);
    }

    @PostMapping("/admin/menus")
    public ResponseEntity<Map<String, Object>> registMenu(@RequestBody MenuDTO menu) {
        /* /admin 경로는 ApiKeyInterceptor 적용 대상이다. */
        menus.add(menu);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "관리자 메뉴 등록 성공");
        response.put("menu", menu);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
