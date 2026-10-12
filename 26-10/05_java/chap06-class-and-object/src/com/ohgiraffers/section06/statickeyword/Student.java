package com.ohgiraffers.section06.statickeyword;

public class Student {

    // non-static 필드: "개인 사물함"
    // new로 객체를 만들 때마다 Heap에 새로 생성되며, 객체마다 독립적이다.
    private int personalLockerCount;

    // Static 필드: "공용 사물함"
    // 프로그램 시작 시 static 영역에 단 하나만 생성되며, 모든 객체가 공유한다.
    private static int sharedLockerCount;

    public int getPersonalLockerCount() {
        return this.personalLockerCount;
    }

    public int getSharedLockerCount() {
        return Student.sharedLockerCount;
    }

    public void increasePL() {
        this.personalLockerCount++;
    }

    public void increaseSL() {
        Student.sharedLockerCount++;
    }
}
