package com.ohgiraffers.section02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {

        /*
         * FileOutputStream: 데이터를 1바이트씩 파일에 출력하는 스트림
         * */

        /*
         * try-with-resources 구문
         * try 괄호 안에서 스트림을 만들면 try 블록이 끝날 때 자동으로 close()가 호출된다.
         * */
        /* new FileOutputStream(path)의 기본 동작은 덮어쓰기이다.
        * 이어쓰기가 필요하다면 new FileOutputStream(path, true)처럼 append 옵션을 선택해야 한다. */

        try (FileOutputStream fout = new FileOutputStream("src/com/ohgiraffers/section02/testOutputStream.txt")) {

            // 1. 1바이트 쓰기
            fout.write(97); // 아스키코드 97 -> a

            /* byte 배열을 이용하여 여러 바이트를 한 번에 기록
            * 10: 개행문자 (엔터) */
            byte[] bar = new byte[] {98, 99, 100, 101, 10, 102};

            fout.write(bar);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
