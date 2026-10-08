package com.ohgiraffers.section02.encapsulation;

public class Application {
    public static void main(String[] args) {

        /* [캡슐화]
        * 필드를 public으로 열어두면 외부 코드가 객체의 상태를 원하는 값으로 직접 바꿀 수 있다.
        * 캡슐화는 필드를 private로 감추고 객체가 제공하는 메소드를 통해 접근하게 하는 방식이다. */

        Children child1 = new Children();
//        child1.nickname = "튼튼이";
//        child1.age = -10;

//        System.out.println(child1.nickname);
//        System.out.println(child1.age);

        child1.setAge(8);  // setter 메소드로 나이 설정
        System.out.println(child1.getAge());
    }
}
