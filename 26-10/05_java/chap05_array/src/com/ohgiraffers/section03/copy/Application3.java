package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /* 향상된 for문
         * 인덱스를 직접 사용하지 않고 배열의 값을 처음부터 끝까지 하나씩 꺼내는 반복문
         * */

        int[] arr = {1, 2, 3, 4, 5};

        /*
         * : 오른쪽의 배열을, : 왼쪽의 임시 변수에 '복사'해서 사용
         * value는 임시 변수이기 때문에 원본 배열에는 영향이 없다.
         * */
        for (int value : arr) {
            value += 10;
            System.out.println(value);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
        }

        System.out.println(Arrays.toString(arr));

        /*
         * 향상된 for문: 값을 '읽을' 목적일 때
         * 일반 for문: 값을 '수정'할 목적일 때
         *  */
    }
}
