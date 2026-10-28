package com.ohgiraffers.jackson;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/members")
public class JacksonController {

    private final List<MemberDTO> memberList;
    // 날짜 모듈 등 Spring Boot의 공통 설정이 적용된 JSON 변환기.
    private final ObjectMapper objectMapper;

    public JacksonController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        memberList = new ArrayList<>();
        memberList.add(new MemberDTO(1, "구준표", 18, LocalDate.of(2026, 4, 21)));
        memberList.add(new MemberDTO(2, "윤지후", 18, LocalDate.of(2026, 4, 22)));
        memberList.add(new MemberDTO(3, "소이정", 18, LocalDate.of(2026, 4, 23)));
        memberList.add(new MemberDTO(4, "프린스송", 18, LocalDate.of(2026, 4, 24)));
    }

    /* List는 JSON 배열로, 각 MemberDTO는 배열 안의 JSON 객체로 직렬화 된다. */
    @GetMapping
    public ResponseEntity<List<MemberDTO>> findMembers() {
        return ResponseEntity.ok(memberList);
    }
    /* MemberDTO 하나는 @JsonProperty와 @JsonFormat이 저장된 JSON 객체로 직렬화 된다. */
    @GetMapping("/{memberNo}")
    public ResponseEntity<MemberDTO> findMember(@PathVariable int memberNo) {

        MemberDTO foundMember = memberList.stream()
                .filter(member -> member.getNo() == memberNo)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 번호의 회원이 없습니다."));

        return ResponseEntity.ok(foundMember);
    }

    /* @RequestBody는 JSON을 MemberDTO로 역직렬화 한 뒤 메서드에 전달한다.
    * 변환할 수 없는 JSON은 400, 지원하지 않는 컨텐트 타입은 415로 처리될 수 있다. */
    @PostMapping
    public ResponseEntity<Map<String, Object>> createMember(@RequestBody MemberDTO member) {
        /* 변환된 객체를 목록에 추가한 뒤 응답에서 다시 JSON으로 직렬화 한다. */
        memberList.add(member);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "회원 등록 요청 성공");
        response.put("member", member);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /* 바깥 Map은 JSON 객체, data의 List는 그 안에 중첩된 JSON 배열이 된다. */
    @GetMapping("/response-wrapper")
    public ResponseEntity<Map<String, Object>> findMembersWithWrapper() {

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "회원 목록 조회 성공");
        response.put("count", memberList.size());
        response.put("data", memberList);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/object-mapper")
    public ResponseEntity<Map<String, Object>> objectMapperTest() {

        String jsonString = objectMapper.writeValueAsString(memberList);

        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "ObjectMapper 직접 변환 결과");
        response.put("jsonString", jsonString);

        return ResponseEntity.ok(response);
    }
}
