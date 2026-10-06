package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /*
         * static 메소드
         * 특정 객체가 아니라 클래스에 속하므로 객체를 만들지 않고 호출한다.
         *
         * 클래스명.메소드명();
         * */

        System.out.println(Application3.sumTwoNumbers(10, 20));

        // 동일한 클래스 내에 작성된 static 메서드는 클래스명 생략 가능
        System.out.println(sumTwoNumbers(10, 20));
    }

    public static int sumTwoNumbers(int first, int second) {
        return first + second;
    }

}
