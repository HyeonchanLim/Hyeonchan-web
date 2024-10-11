package com.green.day04.ch05;

public class LabeledBreakPoint {
    public static void main(String[] args) {
        outer : // label 레이블 outer선언 , 밑에 테이블을 포함
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                if((i*j)==54){
                    System.out.printf("%d x %d = %d\n" , i , j , (i*j));
                    break outer; // 레이블 outer를 종료한다.
                }
            }
        }
        System.out.println("끝");
        int n=1;
        outer:
        while(true){
            while(true){
                if (n==10){
                    break outer;
                }
            }
        }
        System.out.println("----");
    }
}
