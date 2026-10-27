package com.ohgiraffers.exceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final List<MemberDTO> members = new ArrayList<>();

    public MemberController() {
        members.add(new MemberDTO(1, "유관순", 16));
        members.add(new MemberDTO(2, "홍길동", 20));
        members.add(new MemberDTO(3, "신사임당", 40));
    }

    @GetMapping
    public ResponseEntity<List<MemberDTO>> findMembers() {
        return ResponseEntity.ok(members);
    }
}
