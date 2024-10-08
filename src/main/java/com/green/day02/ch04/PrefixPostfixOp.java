package com.green.day02.ch04;

public class PrefixPostfixOp {
    public static void main(String[] args) {
        int n = 7;
        // ++ 증가 연산자 , -- 감소 연산자
        // 증가 연산자 사용시 쓰기만 한다면 pre , post 상관없음
        // 증가 연산자 사용시 쓰기 / 읽기를 둘 다 한다면 차이가 잇음

        System.out.printf("1 - n: %d\n" , n);
        n++;
        System.out.printf("2 - n: %d\n" , n);
        ++n;
        System.out.printf("3 - n: %d\n" , n);
        n+=1;
        System.out.printf("4 - n: %d\n" , n);
        n--;
        System.out.printf("5 - n: %d\n" , n);
    }
}
