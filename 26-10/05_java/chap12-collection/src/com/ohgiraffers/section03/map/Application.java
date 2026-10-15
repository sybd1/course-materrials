package com.ohgiraffers.section03.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        /*
        * [Map]
        * - key와 value를 하나의 쌍(Entry)로 묶어서 관리한다.
        * - key는 중복 저장을 허용하지 않는다.
        * - value는 중복 저장을 허용한다.
        * - 저장 순서를 유지하지 않는다 (HashMap의 경우)
        * */

        Map<String, String> hmap = new HashMap<>();

        hmap.put("one", "java");
        hmap.put("two", "jdbc");
        hmap.put("three", "mysql");
        hmap.put("two", "html");
        hmap.put("four", "java");

        System.out.println(hmap);

        System.out.println(hmap.get("one"));
        System.out.println(hmap.get("five"));   // 없는 key는 null 반환
        System.out.println(hmap.containsKey("two"));    // key 존재 여부 확인

        hmap.remove("four");
        System.out.println(hmap);

        // keySet(): 모든 키를 Set으로 받아, 키로 값을 다시 조회한다.
        System.out.println("keySet() 이용");
        Set<String> keys = hmap.keySet();
        for (String key : keys) {
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        // values(): 모든 값들만 Collection으로 반환 받아 순회하는 방법
        Collection<String> values = hmap.values();
        for (String value : values) {
            System.out.println(value);
        }

        // entrySet(): 모든 키-값 쌍(Entry)를 Set으로 반환한다.
        // key와 value 모두 필요할 때는 key로 다시 조회하지 않는 이 방식이 가장 직접적이다.
        System.out.println("entrySet() 이용");
        Set<Map.Entry<String, String>> entrySet = hmap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
