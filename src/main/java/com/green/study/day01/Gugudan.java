package com.green.study.day01;

public class Gugudan {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for (int j = 1; j <= 5; j++ ) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
        }
        System.out.println("끝");
    }
}
