package com.ohgiraffers.section03.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serial;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. Properties에 대해 이해하고 활용할 수 있다. */
        /* 설명.
        *  Properties란?
        *   HashMap과 거의 유사하지만 Key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
        *   (Generic이 String으로 고정)
        *   주로 설정 파일 관련된 파일과 입출력에 사용된다.(store, load 등)
        * */
        Properties prop = new Properties();

        prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:@localhost:1521:XE");
        prop.setProperty("password", "swcamp");
        System.out.println("prop = " + prop);

        /* 설명. Properties를 활용한 설정정보 파일로 출력해보기 */
        try {
//            prop.store(new FileOutputStream("driver.dat"), "jdbc dirver");
            prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver xml ver.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        /* 설명. 저장된 설정 파일에서부터 읽어온 데이터를 담을 새로운 Properties 객체 */
        Properties prop2 = new Properties();
        System.out.println("읽어오기 전: " + prop2);

        try {
            // file에서 각 각 문자열을 parsing한 후 각 각에 원하는 값을 뽑아내는 걸 하나의 method로 처리
//            prop2.load(new FileInputStream("driver.dat"));
            prop2.loadFromXML(new FileInputStream("driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("읽어온 후: " + prop2.getProperty("driver"));
        System.out.println("url: " + prop2.getProperty("url"));
        System.out.println("user: " + prop2.getProperty("user"));
        System.out.println("password: " + prop2.getProperty("password"));



    }
}
