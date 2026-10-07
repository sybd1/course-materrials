package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 깊은 복사 - 1차원 기본형 배열
        * 새로운 배열을 생성하고 기존 배열의 int값 복사
        * */

        int[] originArr = {1, 2, 3, 4, 5};
        System.out.println("원본배열: " + Arrays.toString(originArr));

        // 1. for문을 이용한 수동 복사
        int[] copyFor = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyFor[i] = originArr[i];
        }

        print("copyFor", copyFor);

        // 2. Arrays.copyOf(원본배열, 복사할 길이);
        int[] copyOf = Arrays.copyOf(originArr, originArr.length);
        print("copyOf", copyOf);

        // 3. System.arraycopy(원본, 원본시작위치, 사본, 사본시작위치, 복사할 길이);
        int[] arrayCopy = new int[originArr.length];
        System.arraycopy(originArr, 0, arrayCopy, 0, originArr.length);
        print("arrayCopy", arrayCopy);

        // 4. clone() - 간단하지만 크기 조절 불가
        int[] copyClone = originArr.clone();
        print("copyClone", copyClone);

        copyClone[0] = 99;

        print("originArr", originArr);
        print("copyClone", copyClone);
    }

    public static void print(String name, int[] arr) {
        System.out.println(name + " : " + Arrays.toString(arr));
    }
}
