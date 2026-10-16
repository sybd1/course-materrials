package com.ohgiraffers.section02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Application4 {
    public static void main(String[] args) {

        /*
        * FileWriter: 문자 데이터를 텍스트 파일에 쓰는 출력 스트림
        * FileReader와 마찬가지로 실행 환경의 기본 문자셋을 사용한다
        * */

        try (FileWriter fw = new FileWriter("src/com/ohgiraffers/section02/testWriter.txt")) {

            fw.write(97);
            fw.write('A');
            fw.write(new char[] {'a', 'p', 'l', 'e'});
            fw.write("안녕하세요 반갑습니다");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Writer writer = new OutputStreamWriter(
                new FileOutputStream("src/com/ohgiraffers/section02/testWriterUtf8.txt"),
                StandardCharsets.UTF_8)) {

            writer.write("UTF-8로 저장한 한글 텍스트");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
