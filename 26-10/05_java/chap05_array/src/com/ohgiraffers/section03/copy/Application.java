package com.ohgiraffers.section03.copy;

public class Application {
    public static void main(String[] args) {

        int[] originArr = {1, 2, 3, 4, 5};

        // 얕은 복사가 일어난다.
        int[] copyArr = originArr;

        /*
         * [얕은 복사]
         * 배열 자체가 복사되는 것이 아니라 배열을 가리키는 참조 값이 복사되므로
         * copyArr의 요소를 바꾸면 originArr에서도 값이 변경된다.
         * 메소드에 인자로 배열을 전달하거나, 메소드가 배열을 반환할 때 발생
         * */

        System.out.println("같은 배열인가? " + (originArr == copyArr));

        System.out.println(originArr[4]);
        copyArr[4] = 80;    // 원본 배열이 아닌 copy한 배열의 값 변경
        System.out.println(originArr[4]);   // 얕은 복사가 일어난다.
    }
}
