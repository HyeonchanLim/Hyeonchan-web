package com.green.day08.ch13;

public class ArrayInstance {
    public static void main(String[] args) {
        // 길이가 5인 int형 1차원 배열의 생성
        int[] ar1 = new int[5];
        int[] ar2 = new int[]{1,2,3,4,5,6,7,8};
        int[] ar3 = {1,2,3,4,5};

        // 길이가 7인 double형 1차원 배열의 생성
        double[] db1 = new double[7];


        System.out.printf("ar1.length : %d\n" , ar1.length);
        System.out.printf("db1.length : %d\n" , db1.length);
        System.out.printf("ar3.length : %d\n" , ar3.length);


    }
}
