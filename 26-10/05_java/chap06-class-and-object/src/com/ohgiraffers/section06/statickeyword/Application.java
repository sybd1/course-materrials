package com.ohgiraffers.section06.statickeyword;

public class Application {

    /*
     * [Static]
     * static 멤버는 특정 객체가 아니라 클래스에 속한다.
     * 객체를 생성하지 않고 클래스 이름으로 접근할 수 있으며 모든 인스턴스(객체)가 하나를 공유한다.
     *  */

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1.getPersonalLockerCount());
        System.out.println(student1.getSharedLockerCount());

        student1.increasePL();
        student1.increaseSL();

        System.out.println(student1.getPersonalLockerCount());
        System.out.println(student1.getSharedLockerCount());

        Student student2 = new Student();
        System.out.println(student2.getPersonalLockerCount());
        System.out.println(student2.getSharedLockerCount());
    }
}
