package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        int n1 = 0 , n2 = 0;
        boolean result;
        result = ((n1 +=10)<0) && ((n2 +=10)>0);
        /*  (n1 = n1 + 10) < 0  -> n1(10) < 0 -> false
            && 연산자에서 false가 나와서 뒤에 n2를 실행하지 않음
            true 실행됏다면 ( n2 = n2 + 10 ) < 0 -> false
         */
        System.out.println("result :" + result);
        System.out.println("n1 :" + n1);
        System.out.println("n2 :" + n2);
    }
}
