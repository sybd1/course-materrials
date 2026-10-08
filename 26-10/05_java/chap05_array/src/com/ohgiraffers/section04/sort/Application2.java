package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        /*
         * [선택 정렬]
         * 정렬되지 않은 범위에서 가장 작은 값의 위치를 찾고,
         * 그 값을 정렬되지 않은 범위의 첫 번째 값과 교환하는 과정을 반복한다.
         * */

        int[] arr = {2, 5, 4, 6, 1, 3};
        System.out.println("정렬 전 : " + Arrays.toString(arr));

        /*
        * i: 가장 작은 값을 놓을 위치
        * minIndex: 실제로 가장 작은 값이 발견된 위치
        * j: 남은 값들을 검사하는 위치
        * */
        for (int i = 0; i < arr.length - 1; i++) {
            // 우선 현재 위치의 값이 가장 작다고 가정
            int minIndex = i;

            // 인덱스의 값을 순서대로 비교한다
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // 찾은 최소값(arr[minIndex])과 현재 자리(arr[i]) 값을 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            System.out.println((i + 1) + "회차 정렬 후: " + Arrays.toString(arr));
        }
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
