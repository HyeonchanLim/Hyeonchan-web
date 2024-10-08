package com.green.day02;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        // n1 / n2 -> 3.3333333


        System.out.println(n1 / n2); // 정수 나누기 정수 -> 정수
        double d = n1 / n2; // 정수 나누기 정수 -> (실수 타입 )d 저장 -> 소수점 추가
        System.out.println(d);
        double d1 = (double)n1 / n2; // 실수 n1 나누기 정수 n2 (자동형변환) -> 실수 값 -> d1에 저장
        System.out.println(d1);
    }
}
