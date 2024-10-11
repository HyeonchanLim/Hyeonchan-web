package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
        gugudan(4);
        gugudan(6);
        gugudanFromTo(5, 9);
    }

    static void gugudan(int n1) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n1, i, (n1 * i));
        }
        //System.out.println("----");
    }

    static void gugudanFromTo(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            //for (int j = 1; j < 10; j++) {
            //    System.out.printf("%d x %d = %d\n", i, j, (i * j));
            //}
            gugudan(i);
        }
    }
}

