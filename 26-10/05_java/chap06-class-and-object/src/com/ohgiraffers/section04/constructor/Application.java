package com.ohgiraffers.section04.constructor;

public class Application {
    public static void main(String[] args) {
        /*
         * 생성자는 new로 객체를 만들 때 호출되어 객체의 초기 상태를 정한다.
         * 기본 생성자와 매개변수 있는 생성자를 차례대로 호출하며
         * setter로 나중에 값을 넣는 방식과 생성 시점에 필요한 값을 전달하는 방식을 비교한다.
         * */

        // 기본 생성자 호출
        User user = new User();
        System.out.println(user.getInformation());

        user.setId("user01");
        user.setPwd("pass01");
        user.setName("판다");
        System.out.println(user.getInformation());

        // 2. 매개변수 있는 생성자
        User user1 = new User("user02", "pass02", "코알라");
        System.out.println(user1.getInformation());
    }
}
