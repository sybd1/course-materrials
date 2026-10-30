package com.ohgiraffers.restapi.section03.swagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/swagger/users")
@Tag(name = "user 관련 api", description = "회원 조회 등록 수정 삭제 API")
public class SwaggerTestController {

    private final List<UserResponseDTO> users;
    private int nextUserNo = 4;

    public SwaggerTestController() {
        users = new ArrayList<>();
        users.add(new UserResponseDTO(1, "user01", "고릴라", new Date(), "active"));
        users.add(new UserResponseDTO(2, "user02", "호랑이", new Date(), "active"));
        users.add(new UserResponseDTO(3, "user03", "원숭이", new Date(), "inactive"));
    }

    @Operation(summary = "회원 목록 조회/검색",
            description = "전체 회원을 조회하거나 name, status query string으로 회원을 검색한다.")
    @ApiResponses({@ApiResponse(responseCode = "200", description = "회원 목록 조회 성공")})
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
                HttpStatus.OK.value(), "조회 성공", responseMap);

        return ResponseEntity.ok(responseMessage);
    }

    @ApiResponses({@ApiResponse(responseCode = "200", description = "회원 단건 조회 성공"),
                   @ApiResponse(responseCode = "404", description = "회원 정보 없음")})
    @GetMapping("/{userNo}")
    public ResponseEntity<ResponseMessage> findUserByNo(@PathVariable int userNo) {
        UserResponseDTO foundUser = findUser(userNo);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("user", foundUser);
        ResponseMessage responseMessage = new ResponseMessage(
                HttpStatus.OK.value(), "조회 성공", responseMap);

        return ResponseEntity.ok(responseMessage);
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

        return ResponseEntity
                .created(URI.create("/api/v1/swagger/users/" + newUser.getNo()))
                .build();
    }

    @PutMapping("/{userNo}")
    public ResponseEntity<Void> modifyUser(
            @PathVariable int userNo,
            @RequestBody UserRequestDTO modifyInfo) {
        UserResponseDTO foundUser = findUser(userNo);

        foundUser.setId(modifyInfo.getId());
        foundUser.setName(modifyInfo.getName());
        foundUser.setStatus(modifyInfo.getStatus());

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{userNo}")
    public ResponseEntity<Void> removeUser(@PathVariable int userNo) {
        UserResponseDTO foundUser = findUser(userNo);
        users.remove(foundUser);

        return ResponseEntity.noContent().build();
    }

    private UserResponseDTO findUser(int userNo) {
        return users.stream()
                .filter(user -> user.getNo() == userNo)
                .findFirst()
                .orElseThrow(() -> new SwaggerUserNotFoundException(
                        userNo + "번 회원 정보를 찾을 수 없습니다."));
    }
}
