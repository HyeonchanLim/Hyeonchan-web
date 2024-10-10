package com.home.ch06;

public class ByEveryone {
    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12 , 12.5);
        hiEveryone(13, myHeight);
        byEveryone();
    }
    public static void hiEveryone(int age, double height) {
        // 매개변수 - int age , double height 두개와 hiEveryone 메소드가 선언됐다.
        // 하나의 메소드에 두개의 메소드가 선언될수도 있고 없이 선언될수도 있다.
        // 대신 위의 메소드에서 선언한 자료형과 매개변수의 타입이 일치해야한다.
        System.out.println("제 나이는 " + age + "세 입니다.");
        System.out.println("저의 키는 " + height + "cm 입니다.");
    }

    public static void byEveryone() {
        // 매개변수가 없는 byEveryone 메소드가 선언됐다.
        // 매개변수를 생략할 수 있지만 메소드를 호출할려면 위에서 전달하는 값이 있어야한다.
        System.out.println("다음에 뵙겠습니다.");
    }
}
