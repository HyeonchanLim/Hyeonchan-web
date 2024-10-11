package com.green.study;

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
    }
}
