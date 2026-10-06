package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {

        /* 변수의 명명 규칙 */

        // 1. 컴파일 에러 발생
        /* 동일한 범위 내에서 동일한 변수명을 가질 수 없다. */
        int age = 20;
//        int age = 10;

        // 예약어 사용 불가(자바에서 미리 사용하겠다고 컴파일러와 약속한 키워드)
//        int true = 1;
//        int for = 20;

        // 대/소문자를 구분한다
        int Age = 20;
        int True = 10;

        // 숫자로 시작할 수 없다.
//        int 1age = 20;
        int age1 = 20;

        // 특수 기호는 '_'와 '$'만 사용가능
//        int sh@rp = 10;
        int _age = 10;
        int $anda = 20;

        // 2. 에러를 발생시키지는 않지만 암묵적 규칙
        int djfkladjkfjsladkfjlsdjkfsjldjfklsjdlkfjs;

        /* 합성어로 이루어진 경우 첫 단어는 소문자, 두 번째 시작 단어는 대문자로 시작한다 (카멜케이스) */
        int maxAge = 20;
        int max_age = 20;   // 단어와 단어 사이의 연결을 언더스코어(_)로 하지 않는다.

        int 나이; // 한국어도 가능하지만 권장하지는 않는다.

        // 변수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다.
        String s;
        String name;

        // 전형적 변수 이름이 있다면 가급적 사용
        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        // boolean은 의문문으로 가급적 긍정형태로 네이밍
        boolean isAlive = true;
        boolean isDead = false; // 부정형보다 isAlive처럼 긍정형으로 표현하면 조건을 읽기 쉽다
    }
}
