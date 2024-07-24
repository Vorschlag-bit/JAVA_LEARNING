package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다.(list부터) */
//        ArrayList list = new ArrayList();
        List list = new ArrayList();     // List 계열의 다른 인스턴스로 바뀌어도 나머지 코드에 영향을
                                         // 않기 위해서 다형성을 적용한 형태로 많이 쓴다!

        /* 설명. 자료형에 구애받지 않고 데이터를 추가할 수 있다. */
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(new java.util.Date());

        /* 설명. 컬렉션들은 toString() Overriding이 잘 되어서 그냥 주소값을 써도 알아서 toString()을 호출한다. */
        System.out.println("list 한 번에 출력: " + list);

        System.out.println("list.get(0): " + list.get(0));   // 처음 add한 값
        System.out.println("list.get(2): " + list.get(2));   // 3번째 add한 값
        System.out.println("list.size(): " + list.size());   // list의 크기를 보는 method

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        /* 설명.
        *  배열보다 ArrayList가 나은 점
        *  1. 처음부터 크기를 할당할 필요가 없다
        *  2. 중간에 값 추가 및 삭제가 배열보다 용이
        * */

        /* 설명. 배열과 ArrayList를 활용해 각각 원하는 인덱스에 값을 추가 */
        int[] arr = new int[5];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ++n;
        }

        System.out.println(Arrays.toString(arr));

        int[] newarr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newarr, 0, arr.length);
        System.out.println(Arrays.toString(newarr));

        /* 설명. 2번 인덱스 위치에 7을 끼워넣기 */
        for (int i = newarr.length - 2; i > 1; i--) {
            newarr[i + 1] = newarr[i];
        }
        System.out.println(Arrays.toString(newarr));
        newarr[2] = 7;
        System.out.println(Arrays.toString(newarr));

        /* 설명. ArrayList에서 제공하는 add() method로 쉽게 해보기 */
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList.add(i + 1);
        }
        System.out.println(intList);
        intList.add(2, 7);     // parameter짜리 add method(Overload)를 활용
        System.out.println(intList);

        /* 설명. ArrayList에는 중복값(동등(e, h))이 허용된다. */
        System.out.println(list);
        list.add("apple");
        list.add(123);
        System.out.println(list);

        /* 설명. ArrayList가 관리하는 값을 수정하려면 set() method 활용한다. */
        list.set(0, 777);
        System.out.println(list);

        /* 설명. Arraylist가 관리하는 값을 삭제하려면 remove() method를 활용한다. */
        list.remove(0);
        System.out.println(list);

        list.add(null);  // null도 된다!
        System.out.println(list);

        /* 설명. ArrayList를 활용한 정렬 */
        /* 설명. 1. 문자열 데이터 정렬 */
        List<String> strlist = new ArrayList<>();
        strlist.add("apple");
        strlist.add("banana");
        strlist.add("pineapple");
        strlist.add("mango");
        strlist.add("melon");

        System.out.println("strlist = " + strlist);

        /* 설명. ArrayList 안에 들어있는 데이터 타입(String)에 정의된 정렬 기준대로 정렬! */
        Collections.sort(strlist);        // String에는 문자열 오름차순(Ascending)에 대한 정의가 되어 있다!
        System.out.println("strlist = " + strlist);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(11235);
        integerList.add(2435);
        integerList.add(2131);
        integerList.add(34565);
        System.out.println("integerList = " + integerList);
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);
        integerList.add(453);

        /* 설명. 내림차순으로 바꾸기 위해 ArrayList에서 LinkedList로 교체 */
        strlist = new LinkedList<>(strlist);  // 다형성에의한 동적바인딩
        // 제너릭은 선언하지 않으면 Object을 기본으로 받기 때문에 나중에 down-casting을 일일이 하기 힘드므로 꼭 선언하자
        /* 설명. Iterator(반복자)는 hasNext()와 next()를 활용해 들어있는 data를 반복시킬 수 있는 타입이다. */
        /* 설명. 다루는 Iterator와 관련된 컬렉션의 제너릭 타입과 일치하는 제네릭을 꼭 써워야한다(down-casting 일일이 적지 않도록) */
        Iterator<String> iter = ((LinkedList<String>) strlist).descendingIterator();     // complie시점 down-casting 후 iterator를 리턴하기 때문에 iterator 객체에 담는다.
        while (iter.hasNext()) {  // StringTokenizer처럼 배열이 아니기 때문에 인덱스가 없어서 값을 꺼내려면 method를 사용해야 한다.
            System.out.print(iter.next() + " ");
        }
    }
}
