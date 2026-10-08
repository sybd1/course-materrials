package com.ohgiraffers.section02.encapsulation;

public class Children {

    /*
     * [접근 제한자]
     * 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
     *
     * (+) public: 모든 패키지에서 접근 허용
     * (#) protected: 동일 패키지에서 접근 허용 (단, 상속관계에 있는 경우 다른 패키지에서도 접근 가능)
     * (~) default: 동일 패키지 내에서만 접근 허용 (작성하지 않는 것이 default)
     * (-) private: 해당 클래스 내부에서만 접근 허용
     *
     * 필드, 메소드, 생성자에는 목적에 따라 위 접근 제한자를 사용할 수 있다.
     * 다른 클래스 안에 들어있지 않은 최상위 클래스에는 public 또는 default만 사용 가능하다.
     * */

    private String nickname;
    private int age;

    /*
     * [Getter / Setter 메소드]
     * Getter (접근자): 내부 필드의 값을 외부에 반환하는 메소드
     * Setter (변경자): 외부에서 전달된 값을 받아, 내부 필드의 값을 설정 또는 변경하는 역할
     * */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("나이는 음수일 수 없습니다.");
            this.age = 0;
        }
    }

    public int getAge() {
        return this.age;
    }
}
