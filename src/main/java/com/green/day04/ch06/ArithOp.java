package com.green.day04.ch06;

public class ArithOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        subtract(7,3);
    }
    static void subtract( int n1 , int n2){
        System.out.printf("%d - %d = %d\n" , n1 , n2 , (n1-n2));
        System.out.printf("%d + %d = %d\n" , n1 , n2 , (n1+n2));
        System.out.printf("%d * %d = %d\n" , n1 , n2 , (n1*n2));
        System.out.printf("%d / %d = %d\n" , n1 , n2 , (n1/n2));
    }
}
