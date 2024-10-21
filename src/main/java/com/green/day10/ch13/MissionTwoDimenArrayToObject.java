package com.green.day10.ch13;

import com.green.day07.ch10.StaticImport;

public class MissionTwoDimenArrayToObject {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("영수" , 100 , 90 , 80);
        arr[1] = new Student("상철" , 90, 90, 80);
        arr[2] = new Student("광수" , 80, 70, 60);

        Student youngSu = arr[0];
        System.out.println(youngSu.getAllScore());
        System.out.println(youngSu.getKorScore() + youngSu.getEngScore() + youngSu.getMathScore());
        System.out.println("----");

        for (Student stu : arr){
            System.out.println(stu);
        }
    }
}

class Student {
    public static final int SUBJECT_CNT = 3;
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }
    public int getKorScore() {
        return korScore;
    }
    public int getEngScore() {
        return engScore;
    }
    public int getMathScore() {
        return mathScore;
    }

    public int getAllScore() {
        return korScore + engScore + mathScore;
    }

    @Override
    public String toString() {
        int totalScore = getAllScore();
        return String.format("%s - 국어 : %d , 영어 : %d , 수학 : %d | 합계 점수 : %d , 평균점수 %.1f" ,
                name , korScore , engScore , mathScore , totalScore , (float)totalScore/SUBJECT_CNT );
    }
}