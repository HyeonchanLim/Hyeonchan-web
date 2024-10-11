package com.green.day04.ch05;

public class Mission05_7_1 {
    public static void main(String[] args) {
        //구구단의 짝수 2,4,6,8,단만 출력하는 프로그램을 작성하되
        // 2단은 2*2까지 , 4단은 4*4까지 , 6*6 , 8*8단 까지 출력하도록 작성하자.
        for (int i = 2; i<=8; i+=2){
            for (int j=1; j<=i; j++){
                //if((i%2)==0){
                    System.out.printf("%d x %d = %d\n" , i , j , (i*j));
                //}
            }
        }
        System.out.println("---");
    }
}
