package com.ohgiraffers.reactintegration.menu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/menus")
public class MenuController {

    private final List<MenuResponse> menus = new ArrayList<>();
    private int nextCode = 3;

    public MenuController() {
        menus.add(new MenuResponse(1, "아메리카노", 3000));
        menus.add(new MenuResponse(2, "카페라떼", 4000));
    }

    @GetMapping
    public ResponseEntity<List<MenuResponse>> findAllMenus() {
        return ResponseEntity.ok(menus);
    }

    @PostMapping
    public ResponseEntity<MenuResponse> registMenu(
            @RequestBody MenuRequest request) {

        MenuResponse createMenu = new MenuResponse(
                nextCode++,
                request.getName(),
                request.getPrice()
        );
        menus.add(createMenu);

        return ResponseEntity.status(HttpStatus.CREATED).body(createMenu);
    }
}
