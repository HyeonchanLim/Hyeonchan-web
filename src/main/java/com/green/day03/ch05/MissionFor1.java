package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /*
        1-10 곱셈 결과 출력 for 문
        sum = 0;
        for (int i=1; i<=10; i++){
        } for ( int j=2; j<=10; j++){
            sum=i*j;
        }
        System.out.println(sum);
         */
        int n = 1;
        for (int i=2; i<11; i++){
            n *= i;
        }
        System.out.printf("%,d\n" , n);
    }
}
