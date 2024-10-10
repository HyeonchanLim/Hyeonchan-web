package com.green.day03.ch05;

public class WhileBasic {
    public static void main(String[] args) {
        /*
        while 문은 반복문이고 () 소괄호 안에 조건식이 true 인 동안 {} 내용이 반복된다.
        조건식이 false 인 경우 {}을 빠져나간다.
        반복 횟수를 정하고 싶으면 3가지 요소가 필요
        1. 인덱스 초기화 > int n = 0;
        2. 비교문 (식)  > n < 5;
        3. 증감식 > n++ , n--
         */

        int n = 0;
        while (n < 5) {
            System.out.println("I Like Java" + n);
            // System.out.println("I Like Java" + (n++)); 아래 n++ 을 print 에 작성해도 됨. n++ () 소괄호는 가독성을 올려줌
            n ++;
        }
        System.out.println("----");
    }
}
