package com.ohgiraffers.common;


public class MemberDTO {

    private int sequence;                 //회원번호
    private String name;                  //이름
    private String phone;                 //휴대폰번호
    private String email;                 //이메일
    private Account personalAccount;      //개인계좌

    public MemberDTO() {
    }

    public MemberDTO(int sequence, String name, String phone, String email, Account personalAccount) {
        this.sequence = sequence;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.personalAccount = personalAccount;
    }


    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getPersonalAccount() {
        return personalAccount;
    }

    public void setPersonalAccount(Account personalAccount) {
        this.personalAccount = personalAccount;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "sequence=" + sequence +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", personalAccount=" + personalAccount +
                '}';
    }
}
