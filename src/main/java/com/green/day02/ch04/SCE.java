package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        /*
        && and 연산자는 false가 나올 확률이 높은 연산을 앞에 배치
        || or 연산자는 true가 나올 확률이 높은 연산을 앞에 배치
         */

        /*
        & | 한개만 쓰는 비트 연산자는 false 가 나와도 끝까지 연산을 진행함
         */

        int n1 = 0 , n2 = 0;
        boolean result;
        result = ((n1 +=10)<0) && ((n2 +=10)>0);
        /*  (n1 = n1 + 10) < 0  -> n1(10) < 0 -> false
            && 연산자에서 false 가 나와서 뒤에 n2를 실행하지 않음
            true 로 실행됏다면 ( n2 = n2 + 10 ) < 0 -> false가 나오고 n2 = 10 으로 변경
         */
        System.out.println("result :" + result);
        System.out.println("n1 :" + n1);
        System.out.println("n2 :" + n2);

        int n3 = 0, n4 = 0;
        result = ((n3 += 10) >0) || ((n4 += 10) >0);
        /*
         (n3 = n3 + 10) > 0  -> n3(10) > 0 -> true
         || or 연산자는 한개라도 true 가 나오면 실행가능
         */
        System.out.println("result :" + result);
        System.out.println("n3 :" + n3);
        System.out.println("n4 :" + n4);
    }
}
