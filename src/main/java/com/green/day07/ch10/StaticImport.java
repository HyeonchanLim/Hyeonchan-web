package com.green.day07.ch10;

import static java.lang.Math.*; // * all 이라는 뜻
// Math 클래스 아래에 있는 static 멤버필드 , 멤버메소드 전부 import 하라는 의미

public class StaticImport {
    public static void main(String[] args) {

        /*
        원래는 아래처럼 작성을 해야하지만
        System.out.println(Math.E); // E - final 상수 , double , static  / () 없으니 멤버필드  ,
        System.out.println(Math.random());

        static import 선언을 하면 아래처럼 사용이 가능하다.
        */
        System.out.println(E);
        System.out.println(random());
    }
}
