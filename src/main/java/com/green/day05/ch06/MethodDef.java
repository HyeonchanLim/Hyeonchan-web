package com.green.day05.ch06;

public class MethodDef {
    static void hiEveryone (int age){

        System.out.printf("좋은 아침입니다. \n 제 나이는 %d 세 입니다.\n" , age);
    }

    public static void main(String[] args) {
        System.out.println("프로그램의 시작");

        hiEveryone(11);
        hiEveryone(30);
        System.out.println("프로그램의 끝");
    }
}
