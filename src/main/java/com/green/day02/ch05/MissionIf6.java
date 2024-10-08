package com.green.day02.ch05;

public class MissionIf6 {
    public static void main(String[] args) {
        int score = (int) ((Math.random() * 101.0));
        System.out.printf("score : %d\n", score);
        String grade = "D", opt = "0";
        int gradeScore = score / 10;
        // 98 / 10 ->> 9
        // 82 / 10 ->> 8
        // 79 / 10 ->> 7
        switch (gradeScore) {
            case 9, 10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
        }
        int optScore = score % 10;
        // 98 % 10 -> 8
        // 76 % 10 -> 6
        if (gradeScore > 6) {
            if (optScore >= 8 || optScore == 100) {
                opt = "+";
            } else if (optScore >= 4) {
                opt = "0";
            }
            System.out.printf("%s%s", grade, opt);
        }
    }
}