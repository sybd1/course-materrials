package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.List;

public class Application6 {
    public static void main(String[] args) {

        /*
         * [제네릭 와일드카드]
         * 호출할 때 들어오는 정확한 요소 타입은 달라도
         * 메서드가 허용할 타입의 범위를 정하는 문법
         * */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);

//        List<Number> numberList = integerList;

        printAnyList(integerList);
        printAnyList(doubleList);

        System.out.println("정수 합계 : " + sum(integerList));
        System.out.println("실수 합계 : " + sum(doubleList));

        List<Number> numberList = new ArrayList<>();
        addInteger(numberList);
        System.out.println("numberList = " + numberList);
    }

    private static void printAnyList(List<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }

    private static double sum(List<? extends Number> list) {
        double total = 0;

        for (Number number : list) {
            total += number.doubleValue();  // 객체형태의 자료형은 연산이 불가능해서, 실수 자료형으로 변경해준뒤 연산한다.
        }
        return total;
    }

    private static void addInteger(List<? super Integer> list) {
        list.add(100);
    }
}
