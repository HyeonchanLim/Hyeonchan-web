package com.green.day01.ch02;

public class StudyDataType {
    public static void main(String[] args) {
        /*
        자료형 : 정수형 , 실수형 , 불린형 , 문자형 >> primitive type (기본타입)
        특징 : 타입 이름이 소문자로 되어 있고 , 총 8개 , 기본 타입을 제외한 나머지는 reference type(참조 타입)이다.

        타입명 옆에 (숫자)는 바이트(크기)를 의미한다.
        정수 - byte (1) , short(2) , int(4) long(8)
        실수 - float(4) , double(8)
        불린 - boolean(1)
        문자형 - char(2)

        자동형변환 방향 - byte > short(char) > int > long > float > double
         */

        byte var1 = 127;
        short var2 = 300;
        int var3 = var1 + var2;

        int var4 = 100;
        long var5 = var4 + var4;

        // int var6 = var5;  = var6은 4byte인 int 타입이고 var5는 8byte인 long타입이라 저장 불가능함 -> 오른쪽 항 타입보다 byte가 같거나 커야함
        int var6 = (int)var5; // var5에 int 로 강제형변환하면 저장 가능함
        // float var7 = var5;
        System.out.println();
    }
}
