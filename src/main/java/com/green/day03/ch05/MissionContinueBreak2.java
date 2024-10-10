package com.green.day03.ch05;

public class MissionContinueBreak2 {
    public static void main(String[] args) {
        /*
        자연수 1부터 시작해서 모든 홀수를 더해 나간다.
        그리고 그 합이 언제 ( 몇을 더햇을 때) 1000을 넘어서는지
        그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해보자
         */
        int n = 0, odd = 0;
        while (odd < 1000) {
            n++;
            if ((n % 2) != 0) { // %2==1 홀수
                System.out.println("n :" + n);
                odd += n;
            }
        }
        System.out.printf("마지막 더한 값 : %d\n" , n);
        System.out.println("odd :" + odd);
    }
}
