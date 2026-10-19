package com.ohgiraffers.section02.functionalinterface;

import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        /*
         * 자주 사용하는 함수형 인터페이스
         * Consumer<T>    : 값을 받아서 소비하고 반환값은 없음.
         * Supplier<T>    : 값은 받지 않고 결과를 반환.
         * Function<T, R> : 값을 받아 다른 결과로 변환.
         * Predicate<T>   : 값을 받아 boolean 결과를 반환.
         * */

        String input = "   java   ";

        Predicate<String> hasText = value -> value != null && !value.trim().isEmpty();
        System.out.println(hasText.test(input));    // true

        // UnaryOperator<T>: 입력과 반환 타입이 같은 변환
        UnaryOperator<String> normalize = value -> value.trim().toUpperCase();
        String normalized = normalize.apply(input);
        System.out.println("normalized = " + normalized);

        Consumer<String> printer = value -> System.out.println("처리결과: " + value);
        printer.accept(normalized);


        Function<String, Integer> length = value -> value.length();
        System.out.println(length.apply(normalized));

        Supplier<String> defaultValue = () -> "GUEST";
        String blankInput = "    ";
        String result = hasText.test(blankInput) ? normalize.apply(blankInput) : defaultValue.get();

        printer.accept(result);
    }
}
