package com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 파라미터 전달 방식
         * 1. 값 복사(Pass by Value)
         * 2. 주소 복사(Pass by Reference)
         *  */

        MethodParameter mp = new MethodParameter();

        int num = 20;
        System.out.println("호출 전 main num : " + num);
        mp.primitiveType(num);  // '값' 20을 복사해서 전달
        System.out.println("호출 후 main num : " + num);   // 원본에 영향 없음

        int[] iarr = {1, 2, 3, 4, 5};
        System.out.println("호출 전 : " + Arrays.toString(iarr));
        mp.ArrayParameter(iarr);    // iarr에 저장된 참조값을 복사해서 전달
        System.out.println("호출 후 : " + Arrays.toString(iarr));  // 원본도 변경됨

        // 가변 인자 테스트
        mp.orderPizza("홍길동");
        mp.orderPizza("유관순", "불고기");
        mp.orderPizza("판다", "치즈", "페퍼로니", "올리브");
    }
}
