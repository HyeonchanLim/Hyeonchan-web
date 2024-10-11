package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 13;
        boolean b = logicalOp1(n1);
        System.out.println(b);
        // 값이 1이상 100이하라면 true 아니라면 false

        boolean b2 = logicalOp2(n1);
        System.out.println(b2);
    }
    static boolean logicalOp1 ( int n1 ){
        return (n1>=1 && n1<=100);
    }
    static boolean logicalOp2 (int n1){
        return ((n1%2)!=1 || (n1%3)!=1);
    }
}
