package com.ohgiraffers.section05.overloading;

public class OverloadingRules {

    /*
     * [ 메서드 시그니처]
     * 메서드를 식별하는 고유한 바코드 = '메서드 이름' + '매개변수 타입, 개수, 순서'
     *
     * 오버로딩: 이름은 같지만 시그니처가 다른 메서드를 여러 개 정의하는 기술
     * */

    public void test() {
    }

    // 매개변수 '개수'가 다른 경우
    public void test(String str) {
    }

    // 매개변수 '타입'이 다른 경우
    public void test(int num) {
    }

    // 매개변수 '순서'가 다른 경우
    public void test(int num, String str) {
    }    // test(3, "안녕")

    public void test(String str, int num) {
    }    // test("안녕", 3)


    // 불성립하는 경우
    // 1. 반환 타입만 다른 경우
//    public int test() {
//        return 0;
//    }

    // 2. 접근 제한자만 다른 경우
//    private void test() {}

    // 3. 매개변수 '이름'만 다른 경우
//    public void test(int num2) {}
}

