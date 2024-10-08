package com.green.day02.ch05;


import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 >>");
        int input = scan.nextInt();
        System.out.printf("input : %d\n" , input);
        // 11 -> 홀수 , 14 -> 짝수
        /*
        if ( input % 2 == 0){
            System.out.println("짝수입니다");
        } else {
            System.out.printf("%d는 홀수입니다" , input);
        }
        System.out.println("끝")
        if ( input % 2 != 0){
            System.out.println("홀수입니다");
        } else {
            System.out.printf("%d는 짝수입니다" , input);
        }

        System.out.printf("%d는 %c수입니다.\n" , input , (input % 2 == 0 ? '짝' : '홀'));
        */
        char result = (input % 2 == 0 ? '짝' : '홀');
        System.out.printf("%d는 %c수입니다.\n" , input , result);

        String result2 = (input % 2 == 0 ? "짝" : "홀");
        System.out.printf("%d는 %c수입니다.\n" , input , result2);


        System.out.println("끝");
    }
}
