package com.ohgiraffers.section01.uses;

public class MemberRepository {

    /*
     * Repository는 데이터를 저장하고 조회하는 역할을 담당한다.
     * 이후 데이터베이스를 배우면 이 역할을 데이터 베이스 접근 코드로 확장할 수 있다.
     *  */

    private static final Member[] members;

    private static int count;

    // static 초기화 블럭: MemberRepository 클래스가 처음 초기화 될 때 한 번 실행된다.
    static {
        members = new Member[10];
    }

    // 매개변수로 전달 받은 Member 객체 배열을 Repository의 members 배열에 저장
    public static boolean store(Member[] newMembers) {

        // 남은 공간보다 저장할 회원 수가 많으면 저장하지 않음
        if (count + newMembers.length > members.length) {
            return false;
        }

        for (int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    /* 저장된 members 배열 반환 */
    public static Member[] findAllMembers() {
        return members;
    }
}
