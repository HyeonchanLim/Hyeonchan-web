package com.green.day09.ch13;

public class VariableArguments {
    public static void main(String[] args) {
        sum(1, 2);
        /*
        가변 인자(인수)
        sum 메소드에서
         */

        sum(10,22,33);

        sumVar(1);
        sumVar(1,2);
        sumVar(1,2,3);
        sumVar(1,2,3,1,2,3);

    }
    // 매개변수 , 매개변수 , 매개변수 이렇게 여러 개 생성하는걸 쉽게 줄여서
    // 타입... values 로 쓰면 배열로 변환이 되어서 파라미터로 들어온다.
    static void sumVar (int... values) {
        int sum = 0;
        for (int i=0; i<values.length; i++){
            sum = sum + values[i];
        }
        System.out.println(sum);
    }


    static void sum(int n1, int n2) {
        System.out.printf("sum : %d", (n1 + n2));
    }

    static void sum(int n1, int n2 ,int n3){
        System.out.println(n1+n2+n3);
    }
}
