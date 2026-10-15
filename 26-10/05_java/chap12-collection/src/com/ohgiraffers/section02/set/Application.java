package com.ohgiraffers.section02.set;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        /*
        * [Set]
        * - 순서를 보장하지 않는다.
        * - 중복을 허용하지 않는다.
        *
        * HashSet       : 중복 제거, 순서 보장 X
        * LinkedHashSet : 중복 제거 + 입력 순서 유지
        * TreeSet       : 중복 제거 + 비교 기준으로 정렬
        * */

        List<String> alist = new ArrayList<>();
        alist.add("java");
        alist.add("mysql");
        alist.add("java");

        Set<String> hset = new HashSet<>();
        hset.add("java");
        hset.add("html");
        hset.add("css");
        hset.add("java");

        System.out.println("ArrayList = " + alist);
        System.out.println("HashSet = " + hset);

        System.out.println("향상된 for문으로 순회");
        for (String value : hset) {
            System.out.println(value);
        }
        System.out.println("Iterator로 순회");
        // iterator()를 호출하면 컬렉션을 순회할 수 있는 Iterator 객체를 반환한다.
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {    // hasNext(): 다음에 꺼낼 요소가 있다면 true
            System.out.println(iter.next());    // next(): 다음 요소를 꺼냄
        }
    }
}
