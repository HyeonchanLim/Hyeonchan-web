package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        /*
        1000이하 자연수 , 2의 배수 & 7의 배수 모두 출력
        그 수들의 합을 출력
         */
        int n=0 , sum=0;

        while (n <= 1000){
                n++;
            if((n%2==0) && (n%7==0)) {
                sum += n;
            }
            // n = 1; 시작이면 if문 뒤에 n++; 붙이면 0->1 횟수 한번을 줄이고 시작
        }
        System.out.println("합계 :" + sum);
    }
}
