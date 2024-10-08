package com.green.day02.ch04;

public class RelationalOp {
    public static void main(String[] args) {
        /*
        관계연산자의 결과타입은 true or false 인 boolean타입이다.

         */
        int n1=3 , n2 =2 , n3=7;
        float n4 = 7.0f; // 리터럴 실수는 기본적으로 double 타입 -> float 타입을 작성할때는 f를 붙여서 작성
        double n5 = 7.0; // 리터럴 실수 7.0이 기본적으로 double 타입이라 d를 생략할 수 있다. d 붙여도 상관 x
        /* double 은 8byte , float 는 4byte
        double n5 = 7.0f; 는 가능
        float n5 = 7.0d; 는 불가능
        타입의 형변환을 할때 크기가 작은걸로는 불가능
        */
        System.out.printf("%d >= %d : %b\n" , n1 , n2 , (n1>=n2));
        System.out.printf("%d >= %d : %b\n" , n1 , n2 , (n1<=n2));
        System.out.printf("%f >= %d : %b\n" , n5 , n3 , (n5<=n3));

    }
}
