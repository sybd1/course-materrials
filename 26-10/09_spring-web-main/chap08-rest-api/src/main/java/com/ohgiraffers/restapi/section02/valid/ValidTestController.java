package com.ohgiraffers.restapi.section02.valid;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/validation")
public class ValidTestController {

    @PostMapping("/users")
    public ResponseEntity<Void> registUser(@Valid @RequestBody UserDTO user) {
        return ResponseEntity
                .created(URI.create("/api/v1/validation/users/1"))
                .build();
    }

    @GetMapping("/users/{userNo}")
    public ResponseEntity<Void> findUserByNo(@PathVariable int userNo) {

        if (userNo != 1) {
            throw new UserNotFoundException(userNo + "번 회원 정보를 찾을 수 없습니다.");
        }

        return ResponseEntity.ok().build();
    }
}
