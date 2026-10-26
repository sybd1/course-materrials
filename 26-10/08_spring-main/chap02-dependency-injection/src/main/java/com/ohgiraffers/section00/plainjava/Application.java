package com.ohgiraffers.section00.plainjava;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;

public class Application {

    public static void main(String[] args) {

        Account account = new PersonalAccount(20, "110-234-567890");

        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("홍길동");
        member.setPhone("010-1234-5678");
        member.setEmail("hong123@gmil.com");
        member.setPersonalAccount(account);

        System.out.println(member.getPersonalAccount());
        System.out.println(member.getPersonalAccount().deposit(10000));
        System.out.println(member.getPersonalAccount().withDraw(5000));
        System.out.println(member.getPersonalAccount().getBalance());

    }
}
