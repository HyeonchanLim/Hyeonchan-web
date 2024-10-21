package com.green.day10.ch13;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어 , 영어 , 수학
                {100, 90, 80},   //영수
                {90, 90, 80},    //상철
                {80, 70, 60}     //광수
        };
        /*
        영수 : 합계 점수 , 평균 점수
        상철 : 합계 점수 , 평균 점수
        광수 : 합계 점수 , 평균 점수
        국어 : 합계 점수 , 평균 점수
        영어 : 합계 점수 , 평균 점수
        수학 : 합계 점수 , 평균 점수
        학급 : 합계 점수 , 평균 점수
         */
        String[] names = {"영수" , "상철" , " 광수"};
        int[] nameScore = new int [names.length];

        String[] subjects = {"국어" , "영어" , "수학"};
        int[] subjectsScore = new int [subjects.length];


        int sum = 0;
        int n1 = 0;
        int Kor , Eng , Math;
        for (int i=0; i<score.length; i++){
            for (int i2=0; i2<score[i].length; i2++){
                sum += score[i][i2];
                n1++;
            }
        }
        System.out.printf("합계 : %d 평균 : %d\n " , sum , (sum/n1));

        for (int i=0; i<score.length; i++){
            for (int i2=0; i2<score[i].length; i2++){
                int sum1 = 0;
                sum1 += score[i][i2];
            }
        }

    }
}
