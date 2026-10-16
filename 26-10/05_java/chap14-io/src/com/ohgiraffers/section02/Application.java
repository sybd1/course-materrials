package com.ohgiraffers.section02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        /*
         * FileInputStream: 파일의 데이터를 바이트 단위로 읽는 입력 스트림
         * 이미지, 영상, 텍스트 등 모든 파일은 바이트로 읽을 수 있다.
         * 다만 텍스트를 글자로 처리할 때는 Reader 계열을 사용하는 편이 알맞다.
         * */

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/com/ohgiraffers/section02/testInputStream.txt");

            int value;

            // read(): 파일에 기록된 값을 1바이트씩 읽어온다. 더 이상 읽을 데이터가 없으면 -1을 반환
            while ((value = fin.read()) != -1) {

                System.out.println(value);  // 읽은 바이트를 0~255 범위의 정수로 확인

                System.out.println((char) value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 사용이 끝난 스트림은 반드시 닫아준다 (자원 반납)
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
