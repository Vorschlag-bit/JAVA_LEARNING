package com.ohgiraffers.section03.use;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 예외처리를 많이 사용하는 io패키지와 관련한 try-catch 구문을 이해할 수 있다. */
        /* 설명.
        *  예외처리를 가장 많이 사용하게 되는 상황(Io 패키지 관련)에서 try - catch 구문을 실제 상황과
        *  유사하게 연습해 보자.
        *  (입출력 관련 문법을 하나하나 신경쓰기 보다는 호출 흐름에 신경 쓰자!)
        *  */

        /* 설명. 프로젝트 바로 아래에 test.dat 파일이 있다면(File 객체 생성) 해당 경로의 절대 경로를 출력 */
        System.out.println(new File("test.dat").getAbsoluteFile());

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("test1.dat"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {

            /* 필기.
            *  예외처리 구문과 상관없이 반드시 수행되어야 하는 구문은 finally에 작성하는데
            *  보통 사용한 자원을 반납할 목적(resource)으로 사용하게 된다.*/
            try {

                /* 필기.
                *  Stream(입출력 관련 통로)이 형성되지 않았을 때, 접근해서 close() method를 호출하게 되면
                *  NullPointerException이 발생할 수 있다. 따라서 if문을 활용해 처리한다.
                * */
                if (br != null)

                    /* 필기.
                    *  입출력에서 사용한 스트림을 닫아주는 method이다.
                    *  API에서 확인해보면 IOException을 throws하는 method이기 때문에
                    *  finally 블럭 안이라도 추가 예외처리를 중첩으로 해줘야 한다.
                    *  */
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
