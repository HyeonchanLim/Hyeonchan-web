package com.green.day04.ch06;

public class ArithOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        subtract(7,3);
        multiply(4,5,"20");

        float r = divide(10,3);
        System.out.println("float r = " + r);

        int r2 = modulo(10,4);
        System.out.println("mod r2 =" + r2);
    }
    static void subtract( int n1 , int n2){
        System.out.printf("%d - %d = %d\n" , n1 , n2 , (n1-n2));
        System.out.printf("%d + %d = %d\n" , n1 , n2 , (n1+n2));
        System.out.printf("%d / %d = %d\n" , n1 , n2 , (n1/n2));
    }
    static void multiply(int n1 , int n2 , String n3){
        System.out.printf("%d * %d = %s\n" , n1 , n2 , n3);
    }
    static float divide (int n1 , int n2){
        return (float)n1 / n2;
    }
    static int modulo (int n1 , int n2){
        return n1 % n2;
    }
}