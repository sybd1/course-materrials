package com.ohgiraffers.jackson;

import tools.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/members")
public class JacksonController {

    private final List<MemberDTO> memberList;
    private final ObjectMapper objectMapper;

    public JacksonController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        memberList = new ArrayList<>();
        memberList.add(new MemberDTO(1, "구준표", 18, LocalDate.of(2026, 4, 21)));
        memberList.add(new MemberDTO(2, "윤지후", 18, LocalDate.of(2026, 4, 22)));
        memberList.add(new MemberDTO(3, "소이정", 18, LocalDate.of(2026, 4, 23)));
        memberList.add(new MemberDTO(4, "프린스송", 18, LocalDate.of(2026, 4, 24)));
    }
}
