package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args){
        final int MAX_SIZE = 100; // final로 상수 선언 , max_size - 스네이크 기법으로 변수명 선언
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;
        
        CONST_ASSIGNED = 12;

        System.out.printf("상수1: %d\n " , MAX_SIZE);
        System.out.printf("상수2: %c\n " , CONST_CHAR);
        System.out.printf("상수3: %d\n " , CONST_ASSIGNED);
    }
}
