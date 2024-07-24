package com.ohgiraffers.section01.object.section06.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. time 패키지의 클래스들이 갖고 있는 필드값들을 확인할 수 있다. */
        LocalTime localTime = LocalTime.now();

        System.out.println("localTime = " + localTime);
        System.out.println("Hour = " + localTime.getHour());
        System.out.println("Minute = " + localTime.getMinute());
        System.out.println("Second = " + localTime.getSecond());
        System.out.println("NanoSecond = " + localTime.getNano());
        System.out.println();

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("Year = " + localDate.getYear());
        System.out.println("Month = " + localDate.getMonth());
        System.out.println("MonthDay =" + localDate.getMonthValue());
        System.out.println("DayOfMonth = " + localDate.getDayOfMonth());
        System.out.println("DayOfYear = " + localDate.getDayOfYear());
        System.out.println("DayOfWeek = " + localDate.getDayOfWeek());
        System.out.println();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zone info = " + zonedDateTime.getZone());
        System.out.println("Offset = " + zonedDateTime.getOffset());

    }
}
