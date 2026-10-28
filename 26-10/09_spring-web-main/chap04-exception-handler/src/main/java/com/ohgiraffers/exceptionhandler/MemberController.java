package com.ohgiraffers.exceptionhandler;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/{memberNo}")
    public ResponseEntity<MemberDTO> findMember(@PathVariable int memberNo) {

        MemberDTO foundMember = members.stream()
                .filter(member -> member.getNo() == memberNo)
                .findFirst()
                .orElseThrow(() -> new MemberNotFoundException(memberNo + "번 회원을 찾을 수 없습니다."));

        return ResponseEntity.ok(foundMember);
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> createMember(@Valid @RequestBody MemberDTO member) {

        boolean duplicatedMemberNo = members.stream()
                .anyMatch(savedMember -> savedMember.getNo() == member.getNo());

        if (duplicatedMemberNo) {
            throw new InvalidMemberRequestException("이미 등록된 회원입니다.");
        }
        members.add(member);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "회원 등록 성공");
        response.put("member", member);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
