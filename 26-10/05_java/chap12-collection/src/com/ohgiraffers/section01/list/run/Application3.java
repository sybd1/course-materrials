package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {

        /*
        * [ LinkedList ]
        * ArrayList는 내부적으로 배열을 이용하는 것과 달리, LinkedList는 '이중 연결 리스트' 방식으로 데이터를 관리한다.
        * 각 요소는 자신의 앞/뒤 요소만 기억한다.
        *
        * 중간에 데이터를 추가하거나 삭제할 때, 앞 뒤 연결만 바꿔주면 되므로 매우 빠르다.
        * 하지만, 특정 위치(인덱스)를 찾으려고 하면, 처음부터 순서대로 찾아가야 하므로 조회 속도가 느리다.
        * 추가/삭제가 많다는 이유만으로 항상 ArrayList보다 빠른 것은 아니다.
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("grape");

        System.out.println(linkedList);

        System.out.println(linkedList.get(1));


    }
}
