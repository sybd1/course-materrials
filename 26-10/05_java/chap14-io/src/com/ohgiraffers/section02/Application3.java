package com.ohgiraffers.section02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Application3 {
    public static void main(String[] args) {

        /*
         * FileReader: byte단위가 아닌 문자 단위로 텍스트를 읽는다.
         * */

        try (FileReader fr = new FileReader("src/com/ohgiraffers/section02/testReader.txt")) {

            int value;

            while ((value = fr.read()) != -1) {
                System.out.println((char) value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // inputStreamReader: 보조스트림으로 혼자 사용할 수 없고, 바이트 스트림을 감싸 문자 변환 기능을 추가
        try (Reader reader = new InputStreamReader(
                new FileInputStream("src/com/ohgiraffers/section02/testReader.txt"),
                StandardCharsets.UTF_8)) {  // 바이트를 해석할 문자 규칙

            int value;
            while ((value = reader.read()) != -1) {
                System.out.println((char) value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
