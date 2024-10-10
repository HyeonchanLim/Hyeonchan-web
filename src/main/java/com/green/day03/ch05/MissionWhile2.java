package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        int n = 1;
        int i = 100;
        do {
            System.out.println(n++);
        } while (n < 100);
        while (i>0) {
            System.out.println(i--);
        }
    }
}
