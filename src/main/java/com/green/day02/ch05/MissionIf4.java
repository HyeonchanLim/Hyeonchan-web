package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int) ((Math.random() * 101.0));
        System.out.printf("score : %d\n", score);
        if (score >= 100 || score >= 98) {
            System.out.println("A+");
        } else if (score >= 97 || score >= 94) {
            System.out.println("A0");
        } else if (score > 90 || score >= 93) {
            System.out.println("A-");
            //System.out.println(score >= 94 ? : "A0" , "A-");
        } else {
            if (score >= 88 || score >= 89) {
                System.out.println("B+");
            } else if (score >= 87 || score >= 84) {
                System.out.println("B0");
            } else if (score > 83 || score >= 80) {
                System.out.println("B-");
            } else {
                if (score >= 79 || score >= 78) {
                    System.out.println("C+");
                } else if (score >= 77 || score >= 74) {
                    System.out.println("C0");
                } else if (score > 73 || score >= 70) {
                    System.out.println("C-");
                } else {
                    System.out.println("D");
                }
            }
        }
    }
}