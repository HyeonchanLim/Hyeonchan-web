package com.green.study.day01;

public class ex7 {
    public static void main(String[] args) {
        int n = 1;
        int count = 0;

        while ((n++)<=200){
            if (n%3==0 || n%8==0){
            System.out.println("n : " + n);
            count++;
            }
        }
        System.out.println("count : " + count);

        for (int n2 = 1; n2<=200; n2++){
            if (n2%3==0 || n2%8==0){
                System.out.println("n2 : " + n2);
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}
