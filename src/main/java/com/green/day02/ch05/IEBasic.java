package com.green.day02.ch05;

public class IEBasic {
    public static void main(String[] args) {
        // if문 , 분기문 : 조건이 true or false 에 따라 실행되게
        int n1 =5 , n2 = 7;

        if(n1 < n2){ // if가 true로 되었을 때만 {} 사이에 있는 코드들이 실행된다.
            System.out.printf("%d < %d is %b\n" , n1 , n2 , (n1<n2));
        } // n1 < n2 - 5 < 7 은 true 기 때문에 printf 가 실행됨
        if(n1 > n2) { // if가 true로 되었을 때만 {} 사이에 있는 코드들이 실행된다.
            System.out.printf("%d > %d is %b\n", n1, n2, (n1 > n2));
        } //  n1 > n2 - 5 > 7은 false라서 printf는 실행 x
        if(n1 == n2) { // if가 true로 되었을 때만 {} 사이에 있는 코드들이 실행된다.
            System.out.printf("%d == %d is true\n", n1, n2);
        } else {
            System.out.printf("%d == %d is false\n" , n1 , n2);
        } // n1(5) 과 n2(7)은 같다 조건문 -> true , false 에 따라 둘 중 하나만 실행한다.
        // true면 조건문 다음 문장에서 실행되어 빠져 나가고 false면 else에서 요구하는걸 실행한다.

        System.out.println("--끝--");
    }
}
