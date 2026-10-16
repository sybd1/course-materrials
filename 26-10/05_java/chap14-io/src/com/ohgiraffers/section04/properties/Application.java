package com.ohgiraffers.section04.properties;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {

        /*
        * [Properties]
        *
        * 프로그램의 설정값은 코드에 직접 흩어 놓기보다
        * key=value 형태의 설정 파일로 관리할 수 있다.
        *
        * Properties는 Map과 비슷한 key-value 구조에 저장과 로딩 기능을 더한 문자열 설정 도구이다.
        * key-value가 모두 String이어야만 한다.
        * */

        String filePath = "src/com/ohgiraffers/section04/properties/application.properties";

        Properties prop = new Properties();
        prop.setProperty("app.name", "fullstack-course");
        prop.setProperty("app.version", "2.0");
        prop.setProperty("app.language", "ko");

        try (Writer writer = new OutputStreamWriter(new FileOutputStream(filePath),
                StandardCharsets.UTF_8)) {

            prop.store(writer, "application settings");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        Properties loadedProp = new Properties();
        try (Reader reader = new InputStreamReader(new FileInputStream(filePath),
                StandardCharsets.UTF_8)) {

            loadedProp.load(reader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(loadedProp.getProperty("app.name"));
        System.out.println(loadedProp.getProperty("app.version"));
        System.out.println(loadedProp.getProperty("app.language"));

    }
}
