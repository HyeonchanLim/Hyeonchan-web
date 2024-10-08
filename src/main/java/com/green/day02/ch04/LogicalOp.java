package com.green.day02.ch04;

public class LogicalOp {
    public static void main(String[] args) {
    /*
    논리 연산자 : %% , || , !
     */
        int n1 = 11 , n2 = 22;
        boolean result;

        result = (1<n1) && (n1<100); // 2~99 사이인지
        System.out.printf("%d은 1초과 100미만인가? %b\n" , n1 , result);

        result = ((n2%2) == 0) || ((n2 % 3) == 0);
        System.out.printf("%d는 2 또는 3의 배수인가? %b\n" , n2 , result); // || or 이라서 한개만 해당해도 true

        result = !(n1 != 0); // ! (n1 은 0과 같지 않다) -> n1은 0과 같다
        System.out.printf("%d는 0인가? %b\n" , n1 , result);
        System.out.printf("%d는 0인가? %b\n" , n1 , n1 == 0);
    }
}