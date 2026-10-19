package com.ohgiraffers.section03.reference;

import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        /*
        * [메서드 참조]
        * 람다가 새로운 동작을 만들지 않고, 이미 존재하는 메서드 하나를 그대로 호출할 때
        * 그 호출을 클래스이름::정적메서드이름 형태로 간결하게 표현하는 문법이다.
        * */

        Function<String, Integer> parseInt = value -> Integer.parseInt(value);

        System.out.println(parseInt.apply("123"));

        // 클래스이름::정적메서드이름
        Function<String, Integer> parseIntReference = Integer::parseInt;

        System.out.println(parseIntReference.apply("123"));

        Consumer<String> printer = message -> System.out.println(message);
        Consumer<String> printerReference = System.out::println;

        printer.accept("헬로 람다!");
        printerReference.accept("헬로 메서드 참조!!");

        // BiPredicate<T, U>: 값 두 개를 받아 boolean으로 반환.
        BiPredicate<String, String> sameText = (left, right) -> left.equals(right);
        BiPredicate<String, String> sameTextReference = String::equals;

        System.out.println(sameText.test("hello", "hello"));
        System.out.println(sameTextReference.test("hello", "world"));

        Supplier<Account> newAccount = Account::new;
        Function<String, Account> newAccountWithName = Account::new;
        BiFunction<String, Integer, Account> newAccountFull = Account::new;

        System.out.println(newAccount.get());
        System.out.println(newAccountWithName.apply("홍길동"));
        System.out.println(newAccountFull.apply("판다", 10000));
    }
}
