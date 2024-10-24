package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    /*
    interface 는 객체가 없는 추상클래스들의 집합체 - 메소드들로만 이루어짐


    List 인터페이스 , 객체화가 불가능하다.

    인터페이스는 부모역할만 한다. List를 상속받은 (LinkedList , ArrayList)클래스가 있다.
    상속받은 둘 Class 결과는 똑같은데 처리방식이 다르다.

    LinkedList는 배열처럼 붙어있지 않고 떨어져 있어서 다음 주소를 불러오는데 시간이 걸린다
    대신 중간에 배열을 추가하거나 수정하는 작업에 유리하다.

    ArrayList는 배열이 붙어있어서 다음 주소를 불러오는데 속도가 빠르다
    대신 배열을 추가하면 새로 만들어서 추가해야하기 때문에 추가 작업에 불편하다.

    LinkedList는 Node 방식으로 데이터를 다루고
    ArrayList는 Array(배열)식으로 데이터를 다룬다.
    LinkedList는 수정 위주의 작업이 많으면 유리하고
    ArrayList는 읽기 위주의 작업이 많으면 유리하다.

    List 변수명 = new ArrayList();
    List 변수명 = new LinkedList();
    이렇게 작성이 가능하다.
     */
    public static void main(String[] args) {
        List list = new ArrayList(); // 배열 길이는 정해져 있지 않고 변수.add(); 로 배열에 추가
        list.add(10); // ArrayList 배열 메소드에서 add로 정수 10 객체를 하나 추가, 처음으로 선언해서 0번방에 입력
        list.add(20); // 마찬가지로 add 메소드로 정수 20을 배열에 추가한다. 두번째로 선언해서 1번방에 입력

        ArrayList list2 = (ArrayList)list; // 명시적형변환
        list2.add(30);  // 2번방
        list2.add("하하"); // 3번방

        int[] arr = new int[3];
        Object[] arr2 = new Object[4]; // 오브젝트는 전부 포용하기 때문에 타입을 구분하지 않음.
        arr2[1]=10;
        arr2[2]="하하"; // 정수 Integer , String 전부 배열에 객체 생성 가능

//        int val0 = list.get(0); // 가져오는 위치가 Object 라서 형변환이 필요함
        int val0 = (int)list.get(0);
        // list.get 으로 가져오는 배열은 최상위 부모인 Object 클래스라서 int로 형변환을 해줘야함
        System.out.println("val0 : " + val0);

        String val1 = (String)list.get(3);
        // list의 3번인 4번째 방은 String 타입의 "하하"가 있어서 String 타입으로 형변환 해줘야함.
        System.out.println("val1 : " + val1);
        System.out.println(list); // ArrayList 에 toString 오버라이딩 되어 있어서 나옴
        System.out.println(list2);

    }
}
