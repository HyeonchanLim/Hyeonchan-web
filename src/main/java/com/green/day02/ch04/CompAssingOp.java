package com.green.day02.ch04;

public class CompAssingOp {
    public static void main(String[] args) {
        /*

         */

        int n1 = 10; // n1이 가지고 있는 값에 +2를 하고 싶다 ->
        n1 = n1 + 2 ; // n1 +=2 와 같음
        System.out.printf("n1: %d\n" , n1);

        int n2 = 10;
        n2 += 2;
        System.out.printf("n2 : %d\n" , n2);

        int n3 = 5;
        n3 = n3 * 3;
        System.out.printf("n3 : %d\n" , n3);

        int n4 = 5;
        n4 *= 3;
        System.out.printf("n4 : %d\n" , n4);

        int n5 = 5;
        n5 /= 3;
        System.out.printf("n5 : %d\n" , n5);

        int n6 = 5;
        n6 %= 3;
        System.out.printf("n6 : %d\n" , n6);

        int n7 = 10;
        n7 /= n6;
        System.out.printf("n7 : %d\n" , n7);
    }
}