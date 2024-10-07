package com.green.day01.ch01;

public class SystemOutPrintln {
    public static void main(String[] args) {
        System.out.println(7);
        System.out.println(3.15);
        System.out.println("3 + 5 = " +8); // 문자열 + 정수 = 문자열 + 문자열 -> 자동형변환
        System.out.println(3.15 + "는 실수입니다."); // 실수 + 문자열 = 문자열 + 문자열 -> 형변환
        // 문자열과 더하기를 만나면 다른항은 무조건 문자열로 자동형변환된다.
        // 연산의 우선순위를 높이고 싶다면 ()로 묶어서 진행
        // ex) 문자열 + (정수 + 정수) = 문자열 + 정수 -> 문자열 + 문자열
        System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
        System.out.println(3 + 5);
    }
}
