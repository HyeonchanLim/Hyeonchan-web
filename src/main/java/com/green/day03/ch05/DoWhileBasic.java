package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        /*
        do - while 문도 반복문이지만 조건이 뒷부분에 있어서 최소 1번의 실행이 이루어짐
        ex) n = 8; , while (n<5); 의 조건일 경우
        while 문은 조건식에서 false 가 떠서 실행이 한번도 안 생김 + true 면 실행
        do - while 문은 한번의 실행 후 조건식에서 false 가 뜨고 빠져나옴
         */

        int n = 0;

        do {
            System.out.println("I Like Java" + (n++));
        } while (n<5);
        System.out.println("-----");
    }
}
