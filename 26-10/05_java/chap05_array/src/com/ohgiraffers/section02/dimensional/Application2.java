package com.ohgiraffers.section02.dimensional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        // 3명 학생의 국어, 영어, 수학 점수를 저장할 2차원 배열
        int[][] scores = {
                {80, 78, 67}, {90, 77, 95}, {70, 89, 94}
        };

        // 각 학생의 총점과 평균 계산 및 출력
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];    // 현재 학생의 j번째 과목 점수 누적
            }
            double avg = sum / (double) scores[i].length;

            System.out.println((i + 1) + "번 학생의 총점: " + sum);
            System.out.println((i + 1) + "번 학생의 평균: " + avg);
        }

        // 학생 수와 과목 수 입력 받기
        Scanner sc =new Scanner(System.in);
        System.out.print("학생 수 입력: ");
        int studentCount = sc.nextInt();
        System.out.print("과목 수 입력: ");
        int subjectCount = sc.nextInt();

        // 입력 받은 수로 배열 생성
        int[][] scores2 = new int[studentCount][subjectCount];

        // 점수 입력 받기
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번째 학생의 점수를 입력하세요");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 점수 : ");
                scores2[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // 순회해서 출력해보기
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번째 학생 점수");
            for (int j = 0; j < subjectCount; j++) {
                System.out.println(scores2[i][j] + " ");
            }
        }










//        int[][] scores2 = new int[2][2];
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < scores2.length; i++) {
//            for (int j = 0; j < scores2[i].length; j++) {
//                System.out.print((i + 1) + "번째 학생, " + (j + 1) + "번째 성적 입력하세요 : ");
//                scores2[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < scores2.length; i++) {
//            for (int j = 0; j < scores2[i].length; j++) {
//                System.out.println(scores2[i][j]);
//            }
//        }
    }
}
