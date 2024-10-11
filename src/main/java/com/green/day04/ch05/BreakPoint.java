package com.green.day04.ch05;

public class BreakPoint {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                if((i*j)==54){
                    System.out.printf("%d x %d = %d\n" , i , j , (i*j));
                    break;
                }
            }
        }
        System.out.println("끝");
    }
}
