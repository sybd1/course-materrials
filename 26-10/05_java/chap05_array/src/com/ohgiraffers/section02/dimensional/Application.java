package com.ohgiraffers.section02.dimensional;

public class Application {
    public static void main(String[] args) {

        // 2차원 배열 선언 및 할당
        int[][] iarr = new int[3][5];

        // 가변 배열: 행마다 열의 개수가 달라도 된다
        int[][] iarr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {11, 12, 13}};

        // 2. 중첩 반복문을 이용한 값 대입
        int value = 1;
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
            }
        }
        // 값 확인
        for (int i = 0; i < iarr.length; i++) {
            for (int j = 0; j < iarr[i].length; j++) {
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }

        // 행만 먼저 생성하는 가변 배열
        int[][] iarr3 = new int[3][];

        iarr[0] = new int[3];
        iarr[0] = new int[4];
        iarr[0] = new int[2];

    }
}
