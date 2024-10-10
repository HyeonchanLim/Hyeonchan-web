package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        int n = 0;

        do {
            System.out.println("I Like Java" + (n++));
        } while (n<5);
        System.out.println("-----");
    }
}
