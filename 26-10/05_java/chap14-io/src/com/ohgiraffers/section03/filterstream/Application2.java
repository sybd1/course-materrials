package com.ohgiraffers.section03.filterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 형변환 보조스트림(InputStreamReader / OutputStreamWriter)
        * - byte 기반 스트림을 char 기반 스트림으로 연결할 때 사용한다.
        * - System.in은 키보드 입력을 바이트 단위로 받는 inputStream이다.
        * - inputStreamReader는 그 바이트를 문자로 해석해 Reader로 바꿔준다.
        * - BufferedReader는 Reader를 감싸서 버퍼 기능과 readLine()을 제공한다. */

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in))) {

            System.out.print("문자열 입력 : ");
            String value = br.readLine();
            System.out.println("value = " + value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
