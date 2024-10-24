package com.green.day13;

import com.green.day01.ch01.SystemOutPrintln;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        // <> = Generic
        // <> 안에 변수는 primitive 입력 불가능 ArrayList 실행될 때 타입 설정
        // -> 정수형 값만 들어갈 수 있는 ArrayList 객체 생성
        List<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>();
        // 3개 전부 결과는 같음
        List<String> list4 = new ArrayList(); // list4 는 String 타입을 설정 ->

        list.add(10); // Integer 타입을 설정해놔서 정수 빼고는 입력 불가
        list.add(20);
        list.add(30);
        list4.add("하하");

        int n1 = list.get(0);
        list.add(1,60); // ( index , element ) index - 넣을 위치 , element - 넣을 데이터

        System.out.println(list);
        list.remove(2); //remove 종류 2가지 1. object  2.int index
        System.out.println(list);
        System.out.println(list.size());// 배열 길이

        list.add(0, 30);
        System.out.println(list);
        System.out.println("list.lastIndexOf(30) : " + list.lastIndexOf(30));
        System.out.println("list.indexOf(30) : " + list.indexOf(30));

        //lastIndexOf, indexOf 메소드의 리턴값이 -1이면 해당값이 콜렉션에 없음을 의미
        System.out.println("list.lastIndexOf(100) : " + list.lastIndexOf(100));
        System.out.println("list.indexOf(100) : " + list.indexOf(100));

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        String n4 = list4.get(0);
        System.out.println(list4);
    }
}


