package com.ohgiraffers.section02.package_and_import;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        /* API
         * 자바는 자주 필요한 기능을 클래스와 메소드로 미리 제공한다
         * 이런 기능을 사용하기 위한 규칙과 도구의 집합을 API라고 부른다.
         * */

        /* java.lang.Math
         * 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스
         * 모든 메소드는 static 메소드이다.
         *  */

        // 절대값 구하기
        Math.abs(-7);

        // 최대값, 최소값
        System.out.println("최대값:" + Math.max(10, 20));
        System.out.println("최소값:" + Math.min(10, 20));

        System.out.println(Math.random());  // 0.0 이상 1.0 미만의 실수 반환

        // 1 ~ 10 까지 난수 발생
        /* 공식: (int) (Math.random() * (구하려는 난수의 개수)) + (구하려는 난수의 최소값) */

        // 10 ~ 15 까지 난수 발생
        int random = (int) (Math.random() * 6) + 10;
        System.out.println("random = " + random);

        /* java.util.Random 클래스를 활용한 난수 발생 */
        // 1. Random 객체 생성
        Random random1 = new Random();

        // 0 ~ 9 난수 발생
        // nextInt(bound): 0부터 bound-1 까지의 정수 난수를 반환
        int random2 = random1.nextInt(10);
        System.out.println("random2 = " + random2);
    }
}
