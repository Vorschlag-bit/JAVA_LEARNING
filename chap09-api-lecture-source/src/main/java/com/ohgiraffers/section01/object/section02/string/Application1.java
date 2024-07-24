package com.ohgiraffers.section01.object.section02.string;

public class Application1 {
    public static void main(String[] args) {

        /* 설명. String 클래스의 자주 사용하는 method에 대해 숙지하고 응용할 수 있다. */
        /* 필기.  1. charAt(): 해당 문자열의 특정 인덱스에 해당하는 문자를 반환 */
        String str = "apple";
        // String은 length라는 method가 있는 거라(필드가 아니라) ()을 붙여야 한다.
        for (int i = 0; i < str.length(); i++) {
            System.out.println("charAt(" + i + ") = " + str.charAt(i));
        }

        /* 필기. compareTo(): 인자를 전달된 문자열과 사전 순으로 비교 */
        String str1 = "java";
        String str2 = "java";
        String str3 = "JAVA";
        String str4 = "maria";

        System.out.println(str1.compareTo(str2));    // compareTo()는 차이나는 만큼을 리턴하므로 0을 리턴
        System.out.println(str1.compareTo(str3));    // 32
        System.out.println(str3.compareTo(str1));    //
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str3.compareTo(str4));

        /* 필기. concat(): 문자열에 인자로 전달된 문자열을 합쳐서 새로운 문자열 반환 */
        System.out.println("concat(): " + str1.concat(str4));

        /* 필기. indextOf(): 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환 */
        String indexOf = "java mariadb";
        System.out.println("indexOf('a'): " + indexOf.indexOf('a'));

        /* 필기. trim(): 문자열의 앞 뒤에 공백을 제거한 문자열을 반환 */
        String trimStr = "     java       ";
        System.out.println("trimStr(): " + trimStr.trim());

        /* 필기.
        *  toLowerCase(): 모든 문자를 소문자로 반환
        *  toUpperCase(): 모든 문자를 대문자로 반환
        * */
        String caseStr = "javamariaDB";
        System.out.println("toLowerCase(): " + caseStr.toLowerCase());
        System.out.println("toUpperCase(): " + caseStr.toUpperCase());
        System.out.println("caseStr(): " + caseStr);

        /* 필기. substring(): 믄자열의 일부분을 잘라 새로운 문자열을 반환 */
        String javamariadb = "javamariadB";

        System.out.println("substring(3, 6):" + javamariadb.substring(3, 6));
        System.out.println("substring(3:" + javamariadb.substring(3));
        System.out.println("javamariadb: " + javamariadb);

        /* 필기. replace(): 문자열에서 대체할 문자열로 기존 문자열을 변경하여 반환 */
        System.out.println("replace(): " + javamariadb.replace("java", "cpp"));

        /* 필기. length(): 문자열의 길이를 정수형으로 변환 */
        System.out.println("length: " + javamariadb.length());
        System.out.println("빈 문자열 길이: " + "".length());

        /* 필기. isEmpty(): 문자열의 길이가 0이라면 참 반환, 아니면 false */
        System.out.println("isEmpty(): " + "".isEmpty());
        System.out.println("isEmpty(): " + "abc".isEmpty());
    }
}
