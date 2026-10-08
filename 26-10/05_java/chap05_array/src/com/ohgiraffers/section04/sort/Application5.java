package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application5 {
    public static void main(String[] args) {
        /*
         * 중복 없는 로또 번호 6개 생성하기
         * 배열, 반복문, 조건문, Math.random(), 값 교환 사용
         * */

        // 1. 정수 6개를 저장할 배열을 만든다.
        int[] lotto = new int[6];

        // 다음 번호를 저장할 배열의 인덱스
        int index = 0;

        /* 2. 1부터 45까지의 난수를 하나 만든다.
         *     현재 배열에 먼저 들어간 값들과 차례로 비교한다.
         *     같은 값이 있으면 배열에 넣지 말고 새로운 난수를 다시 만든다.
         *     중복되지 않을 때만 배열에 저장하고 다음 인덱스로 이동한다.
         *
         * 힌트: 배열에 몇개를 저장했는지 나타내는 인덱스와
         *      중복 여부를 기억할 boolean 변수를 사용할 수 있다.
         * */
        while (index < lotto.length) {

            // 난수 생성
            int randomNumber = (int) (Math.random() * 45) + 1;

            // 생성한 번호의 중복 여부 관리
            boolean isDuplicate = false;

            // 이미 저장된 번호까지만 검사
            for (int i = 0; i < index; i++) {

                if (lotto[i] == randomNumber) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복이 아닐 때만 배열에 저장
            if(!isDuplicate) {
                lotto[index] = randomNumber;
                index++;
            }
        }

        // 3. 여섯 개를 모두 저장한 뒤 오름차순으로 정렬하고 출력한다. (어렵다면 sort 사용)
        Arrays.sort(lotto);

        System.out.println(Arrays.toString(lotto));


//        int[] numbers = new int[6];
//
//        int randomNumbers = (int) (Math.random() * 45) + 1;

//        System.out.println(Arrays.toString(numbers));
//        System.out.println(randomNumbers);

//        for (int i = 0; i < numbers.length; i++) {
//            randomNumbers = numbers[i];
//            if (randomNumbers == numbers[i]) {
//                continue;
//            }
//
//        }
    }
}
