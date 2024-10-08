package com.green.day02.ch05;

public class MissionIf5 {
    public static void main(String[] args) {
        int score = (int) ((Math.random() * 101.0));
        System.out.printf("score : %d\n", score);
        char grade= 'D' , opt = '0';
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            }
        } else {
            opt = ' ';
        }
        System.out.printf("%c%c\n", grade, opt);
    }
}