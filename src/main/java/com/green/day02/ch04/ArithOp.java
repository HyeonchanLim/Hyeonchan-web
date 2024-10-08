package com.green.day02.ch04;

public class ArithOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;

        System.out.printf("%d + %d = %d\n" , n1 , n2 , (n1+n2));
        System.out.printf("%d - %d = %d\n" , n1 , n2 , (n1-n2));
        System.out.printf("%d * %d = %d\n" , n1 , n2 , (n1*n2));
        System.out.printf("%d / %d = %d\n" , n1 , n2 , (n1/n2));
        System.out.printf("%d %% %d = %d\n" , n1 , n2 , (n1%n2)); // printf 에서 mod % 한개만 쓰면 코드로 인식해서 오류 발생
        /*
        a % 2 == 0 -> 2짝수로 나누어지면 짝수 , 아니면 홀수
        a % 7 == 0 -> 7로 나눴을 때 나머지 값이 0이면 7의 배수이다
        a % 2 != 0 -> 2로 나눴을 때 나머지 값이 0이 아니면

         */
    }
}
