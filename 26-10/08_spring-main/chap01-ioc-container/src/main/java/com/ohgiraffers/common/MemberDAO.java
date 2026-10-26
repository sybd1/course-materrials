package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/* 회원 정보를 메모리에 저장하고 조회·등록하는 수업용 DAO */
/* bean 이름을 지정하지 않으면 클래스 이름의 첫글자를 소문자로 바꿔 bean으로 등록(memberDAO). */

@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "유관순"));
    }

    /* 매개변수로 전달 받은 회원 번호를 map에서 조회 후 회원 정보를 리턴하는 메소드 */
    public MemberDTO selectMember(int sequence) {
        return memberMap.get(sequence);
    }

    /* 매개변수를 전달 받은 회원 정보를 map에 추가하고 성공 실패 여부를 boolean으로 리턴하는 메소드 */
    public boolean insertMember(MemberDTO newMember) {

        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

        int after = memberMap.size();

        return after > before;
    }
}
