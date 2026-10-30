package com.ohgiraffers.restapi.section01.responseentity;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/response/users")
public class ResponseEntityTestController {

    private final List<UserResponseDTO> users;
    private int nextUserNo = 4;

    public ResponseEntityTestController() {
        users = new ArrayList<>();

        users.add(new UserResponseDTO(1, "user01", "고릴라", new Date(), "active"));
        users.add(new UserResponseDTO(2, "user02", "호랑이", new Date(), "active"));
        users.add(new UserResponseDTO(3, "user03", "원숭이", new Date(), "inactive"));
    }

    @GetMapping
    public ResponseEntity<ResponseMessage> findUserByConditions(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String status) {

        List<UserResponseDTO> foundUsers = users.stream()
                .filter(user -> {
                    if (status != null && !user.getStatus().equals(status)) {
                        return false;
                    }
                    if (name != null && !user.getName().contains(name)) {
                        return false;
                    }
                    return true;
                })
                .collect(Collectors.toList());
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("users", foundUsers);

        ResponseMessage responseMessage = new ResponseMessage(
                HttpStatus.OK.value(),
                "조회 성공",
                responseMap
        );
        return new ResponseEntity<>(responseMessage, HttpStatus.OK);
    }

    // 단건 조회

    @GetMapping("/{userNo}")
    public ResponseEntity<ResponseMessage> findUserByNo(@PathVariable int userNo) {

        UserResponseDTO foundUser = users.stream()
                .filter(user -> user.getNo() == userNo)
                .findFirst()
                .get();

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("user", foundUser);

        ResponseMessage responseMessage = new ResponseMessage(
                HttpStatus.OK.value(), "조회 성공", responseMap
        );

        return ResponseEntity
                .ok()
                .body(responseMessage);
    }

    @PostMapping
    public ResponseEntity<Void> registUser(@RequestBody UserRequestDTO request) {

        UserResponseDTO newUser = new UserResponseDTO(
                nextUserNo++,
                request.getId(),
                request.getName(),
                new Date(),
                request.getStatus()
        );
        users.add(newUser);
        // 상태를 201로 만들고, 전달한 URI를 Location header에 넣는다.
        return ResponseEntity.created(URI.create("api/v1/response/users/"
                + newUser.getNo())).build();
    }

    @PutMapping("/{userNo}")
    public ResponseEntity<Void> modifyUser(
            @PathVariable int userNo,
            @RequestBody UserRequestDTO modifyInfo) {

        UserResponseDTO foundUser = users.stream()
                .filter(user -> user.getNo() == userNo)
                .findFirst()
                .get();

        foundUser.setId(modifyInfo.getId());
        foundUser.setName(modifyInfo.getName());
        foundUser.setStatus(modifyInfo.getStatus());

        // noContent()가 상태를 204로 정하고, body가 없으므로 build()로 완성
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{userNo}")
    public ResponseEntity<Void> removeUser(@PathVariable int userNo) {

        UserResponseDTO foundUser = users.stream()
                .filter(user -> user.getNo() == userNo)
                .findFirst()
                .get();

        users.remove(foundUser);

        return ResponseEntity.noContent().build();
    }
}
