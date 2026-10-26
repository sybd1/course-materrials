package com.ohgiraffers.section00.plainjava;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;

public class Application {

    public static void main(String[] args) {

        MemberDAO memberDAO = new MemberDAO();

        MemberDTO member = memberDAO.selectMember(1);
        System.out.println(member);

        MemberDTO newMember = new MemberDTO(3, "user03", "pass03", "신사임당");
        System.out.println(memberDAO.insertMember(newMember));
        System.out.println(memberDAO.selectMember(3));
    }
}
