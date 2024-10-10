package com.green.day03.ch05;

public class ContinueBasic {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;

        while ((n++)<100 ) {
            if (((n%5)!= 0 ) || ((n%7) !=0)) { // 5의 배수도 아니고 7의 배수도 아닌거의 false - 5와 7의 배수인거 true
                continue; // break로 빠져나가지 않고 if 조건부 계속 반복
            }
            count++;
            System.out.println("n: " + n); // while 조건식에서 ++ 증감식으로 n=1 부터 시작
        }
        System.out.println("count :" + count);
    }
}