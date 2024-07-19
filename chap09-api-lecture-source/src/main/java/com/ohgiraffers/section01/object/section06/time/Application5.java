package com.ohgiraffers.section01.object.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. time Package의 클래스들에 포메팅을 적용하여 출력할 수 있다. */
        String timeNow = "14:05:20";
        String dateNow = "2022-01-15";

        LocalTime localTime = LocalTime.parse(timeNow);
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);

        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);

        /* 설명. pattern을 완벽하게 인색해 줘야할 때 */
        String timeNow2 = "14-06-13";
        String dateNow2 = "20220312";

        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyyyMMdd"));

        System.out.println("localTime2 = " + localTime2);
        System.out.println("localDate2 = " + localDate2);

        /* 설명. time Package가 인식한 날짜 및 시간을 원하는 문자열로 반환하기 */
        String dateFormat = localDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH mm"));
    }
}
