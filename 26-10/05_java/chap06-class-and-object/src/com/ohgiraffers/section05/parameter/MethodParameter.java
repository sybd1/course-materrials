package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class MethodParameter {

    // 기본 자료형: '값' 복사 -> 원본 불변
    public void primitiveType(int num) {
        System.out.println("전달받은 num : " + num);
        num = 99;
        System.out.println("변경 후 num : " + num);
    }

    // 배열, 객체(참조 자료형) : '주소값'이 복사
    public void ArrayParameter(int[] arr) {
        System.out.println("전달받은 arr = " + Arrays.toString(arr));
        arr[0] = 99;
        System.out.println("변경 후 arr = " + Arrays.toString(arr));
    }

    /* 가변인자: 전달인자의 개수가 유동적일 때 사용,
     * JS의 ...rest와 역할이 비슷하다.
     * 전달한 값 0개 이상을 받아 메소드 내부에서 배열로 취급한다. 매개변수의 마지막 위치에 작성한다.
     *  */
    public void orderPizza(String customerName, String... toppings) {
        System.out.println(customerName + "고객님!!");
        System.out.println("주문하신 피자 토핑: " + Arrays.toString(toppings));
    }
}
