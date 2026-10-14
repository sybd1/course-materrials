package com.ohgiraffers.section01.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        /*
        * java.time 패키지의 주요 클래스
        *
        * LocalDate: 날짜
        * LocalTime: 시간
        * LocalDateTime: 날짜 + 시간
        * 국가별 시간대가 필요한 서비스는 ZonedDateTime과 ZoneID를 사용한다.
        * */

        LocalDate departureDate = LocalDate.of(2026,10,14);
        LocalTime departureTime = LocalTime.of(14, 30);

        LocalDateTime trainDeparture = LocalDateTime.of(departureDate, departureTime);
        System.out.println("기차 출발 시각 = " + trainDeparture);

        // 현재 날짜와 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시각 = " + now);

        System.out.println(trainDeparture.getYear());   // 2026
        System.out.println(trainDeparture.getMonth());  // DECEMBER
        System.out.println(trainDeparture.getMonthValue()); // 12
        System.out.println(trainDeparture.getDayOfWeek());  // FRIDAY

        /* plus...(), minus...() 이용하여 시간계산을 할 수 있다.
        * java.time 객체는 불변이다. 원본 객체를 변경하지 않고 계산된 새로운 객체를 반환한다
        * 따라서 반환값을 변수에 저장해야 계산 결과를 사용할 수 있다. */
        LocalDateTime arrivalDeadline = trainDeparture.minusMinutes(20);
        System.out.println("arrivalDeadline = " + arrivalDeadline);
        System.out.println(trainDeparture);

        /* 날짜 비교하기 isBefore(), isAfter(), isEqual()*/
        boolean isPast = trainDeparture.isBefore(now);
        System.out.println("기차 떠났나요? " + isPast);

        /* 포매팅
        * DateTimeFormatter를 사용하면 날짜/시간 객체를 원하는 형식의 문자열로 변환하거나,
        * 특정 형식의 문자열을 날짜/시간 객체로 변환할 수 있다. */

        // Format: LocalDateTime -> String
        // 1. 원하는 출력 형식의 패턴을 만든다.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 출발");
        // 2. 날짜 객체에 format() 메서드를 호출하며 패턴을 전달한다.
        String ticket = trainDeparture.format(formatter);
        System.out.println("ticket = " + ticket);

        /* Parse: String -> LocalDate */
        String christmas = "20261225";  // yyyyMMdd 형식의 문자열
        // 1. 분석할 문자열의 패턴을 만든다
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyyMMdd");
        // 2. LocalDate.parse() 메서드를 호출하여 문자열과 패턴 전달
        LocalDate parsedDate = LocalDate.parse(christmas, parser);
        System.out.println("parsedDate = " + parsedDate);
    }
}
