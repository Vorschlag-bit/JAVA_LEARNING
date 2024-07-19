package com.ohgiraffers.section01.object.section05.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        
        /* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
        /* 필기. 
        *  Date형 대비 개선점
        *  1. timeZone과 관련된 기능이 추가되었다.
        *  2. 윤년 관련 기능이 내부적으로 추가되었다.
        *  3. 날짜 및 시간 필드 개념을 추가해 불필요한 method 명을 줄인다.
        *  */

        Calendar calendar = Calendar.getInstance();   // new 연산자를 사용할 수 없음! 이 클래스의 생성자가 private으로 막혀있기 때문
        System.out.println("calendar = " + calendar);
        
        Calendar calendar2 = new GregorianCalendar();
        calendar2.get(1);
        System.out.println("calendar2.get(Calendar.YEAR) = " + calendar2.get(Calendar.YEAR));
        
        int year = 1998;
        int month = 2;
        int dayofMonth = 12;
        int hour = 8;
        int minute = 59;
        int second = 59;
        
        Calendar birthday = new GregorianCalendar(year, month, dayofMonth, hour, minute, second);
        System.out.println("birthday = " + birthday);

        System.out.println("year = " + birthday.get(Calendar.YEAR));
        System.out.println("Month = " + birthday.get(Calendar.MONTH));
        System.out.println("dayofMonth = " + birthday.get(Calendar.DAY_OF_MONTH));
        System.out.println("weekOfYear = " + birthday.get(Calendar.DAY_OF_WEEK));

        String week = "";
        switch(birthday.get(Calendar.DAY_OF_WEEK)) {
            case 1: week = "Sunday"; break;
            case 2: week = "Monday"; break;
            case 3: week = "Tuesday"; break;
            case 4: week = "Wednesday"; break;
            case 5: week = "Thursday"; break;
            case 6: week = "Friday"; break;
            case 7: week = "Saturday"; break;
            default: week = "Sunday"; break;
        }
        System.out.println("week = " + week);
    }
}
