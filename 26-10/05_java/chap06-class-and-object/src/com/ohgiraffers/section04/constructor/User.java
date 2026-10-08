package com.ohgiraffers.section04.constructor;

import java.util.Date;

public class User {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /*
     * [생성자 작성 규칙]
     * 1. 이름이 클래스명과 반드시 동일해야 한다.
     * 2. 반환 타입(void, int 등)을 쓰지 않는다.
     *
     * 접근제한자 클래스명(매개변수) {
     *   필드 초기화 코드
     * }
     *  */

    /* 1. 기본 생성자
     * 클래스에 생성자가 하나도 없다면 자바 컴파일러가 기본 생성자를 자동으로 추가해준다.
     * (우리가 생성자 함수 작성 없이도 객체를 생성할 수 있었던 이유!!)
     *
     * 주의!!!
     * 매개변수 있는 생성자가 하나라도 있다면, 컴파일러가 기본 생성자를 자동으로 추가해 주지 않는다.
     *  */
    public User() {
        System.out.println("User 클래스의 기본생성자 호출됨..");
    }

    // 2. 매개변수 있는 생성자
    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        System.out.println("id, pwd, name을 초기화하는 생성자 호출.");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    public String getInformation() {
        return "User: " + this.id + " " + this.pwd + " " + this.name + " " + this.enrollDate;
    }
}
