package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        /*
         * BufferedWriter / BufferedReader
         * - 기본 스트림(FileWriter / FileReader)을 감싸서 사용하는 보조 스트림이다.
         * - 버퍼는 데이터를 모아두는 공간이다.
         * - 데이터를 바로바로 파일에 쓰거나 읽는 것보다, 버퍼를 거치면 입출력 횟수를 줄일 수 있다.
         * */


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                "src/com/ohgiraffers/section03/filterstream/testBuffered.txt"))) {

            bw.write("안녕");
            bw.write("반가워");

            /* write로 쓴 내용은 일단 버퍼에 머무를 수 있다.
             * flush()는 버퍼에 남은 내용을 즉시 파일로 밀어내는 메서드이다.
             * 지금은 try-with-resources가 끝나며 close()가 호출되고,
             * close() 과정에서 flush도 함께 처리된다. */

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(
                new FileReader("src/com/ohgiraffers/section03/filterstream/testBuffered.txt"))) {

            String temp;
            // readLine(): 파일 내용을 한 줄씩 읽어 String으로 반환한다.
            // 더 이상 읽을 줄이 없으면 null을 반환한다.
            while((temp = br.readLine()) != null) {
                System.out.println(temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
