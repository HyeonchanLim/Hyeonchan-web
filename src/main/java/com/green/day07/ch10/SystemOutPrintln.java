package com.green.day07.ch10;

import java.io.PrintStream;

public class SystemOutPrintln {
    public static void main(String[] args) {
        // System.abc.kkk().ggg

        // System.abc 의 결과물을 "A" 지칭하자 -> A.kkk().ggg
        // A.KKK() 의 결과물을 "B" 지칭하자 -> B.ggg

        // System : 클래스
        // abc : 참조변수 , 멤버필드
        // kkk() : abc 가 가리키고 있는 객체의 메소드 , 리턴타입은 참조 , 뒤에 .ggg가 붙었기 때문
        // ggg : kkk()메소드가 리턴하는 객체의 멤버 필드 , 변수


        System.out.println();

        PrintStream aaa = System.out;
        aaa.println();

        /*
        System.out.???? - ???? 오버로딩 해놓은 목록들
        PrintStream은 println(int i) , println(char c), println(String str) 등의 메소드를 가지고 있고 이것은 오버로딩이다.
        만약 오버로딩이 없다면 printlnInt(int i) , printlnChar(char c) , printlnString(String str) 이런식으로 메소드를 만들어야 한다.
        */

        //system : 클래스
        // out : public static final 멤버필드 / java. io. PrintStream out , PrintStream 객체의 주소값을 담을 수 있다.
        // println() : 메소드
    }
}
