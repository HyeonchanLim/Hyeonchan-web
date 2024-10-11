package com.green.study.day01;

public class ex5 {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                if ((i*j)==36){
                    System.out.printf("%d x %d = %d\n" , i , j , (i*j));
                }
            }
        }
        System.out.println("끝");
    }
}
