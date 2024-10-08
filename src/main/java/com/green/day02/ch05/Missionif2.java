package com.green.day02.ch05;

import com.green.day01.ch01.SystemOutPrintln;

public class Missionif2 {
    public static void main(String[] args) {
        //int score = ?; // 0~100 사이의 랜덤값 나오도록 셋팅
        int score = (int)((Math.random()*100)+1);
        System.out.printf("score : %d\n" , score);

        if (score >=90){
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >=70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
        System.out.println("끝");
    }
}
