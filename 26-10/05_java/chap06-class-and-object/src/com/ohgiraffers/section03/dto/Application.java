package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {

        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("판다");
        member.setAge(5);
        member.setGender('여');
        member.setHeight(161);
        member.setActivated(true);

        System.out.println(member.getAge());
        System.out.println(member.getName());

    }
}
