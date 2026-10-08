package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Arrays.sort(): 자바가 제공하는 배열 정렬 기능
        * int[]는 별도의 비교 함수를 전달하지 않아도 숫자 오름차순으로 정렬된다.
        * */

        int[] arr = {2, 7, 3, 5, 1, 9};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
