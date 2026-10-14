package com.ohgiraffers.section01.Stringbuilder;

public class Application {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        /*
         * [String]
         * - 불변 객체
         * - 연결 결과로 새로운 문자열이 만들어짐
         * - 반복적인 문자열 연결에는 비효율적일 수 있음
         *
         * [StringBuilder]
         * - 가변 객체
         * - append()로 내부 내용을 누적
         * - 반복적인 문자열 조립에 적합
         * */

        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long endTime = System.nanoTime();
        System.out.println(str.length());
        System.out.println("작업 시간: " + (endTime - startTime));

        startTime = System.nanoTime();


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        String result = sb.toString();  // 일반 문자열로 반환

        endTime = System.nanoTime();

        System.out.println(sb.length());
        System.out.println("StringBuilder 작업 시간: " + (endTime - startTime));

        StringBuilder sb2 = new StringBuilder("javamysql");

        /* delete (start, end): 시작 인덱스부터 종료 인덱스 전까지의 문자열 제거 */
        System.out.println(sb2.delete(4, 9));

        /* insert(index, value): 지정한 인덱스에 값 삽입 */
        System.out.println(sb2.insert(0, "my"));

        /* reverse(): 문자열의 순서를 뒤집는다 */
        System.out.println(sb2.reverse());

        // append()는 자기 자신(StringBuilder)을 반환하므로 메서드 체이닝이 가능하다
        StringBuilder query = new StringBuilder();
        query.append("SELECT ")
                .append("* ")
                .append("FROM product ")
                .append("WHERE price ")
                .append(10000 );

        String result2 = query.toString();
        System.out.println(result2);
    }
}
