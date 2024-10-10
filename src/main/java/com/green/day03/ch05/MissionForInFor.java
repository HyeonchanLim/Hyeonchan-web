package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        for (int i=2; i<10; i++){
            for (int x=1; x<10; x++){
                System.out.printf("%d x %d = %d\n" , i , x , (i*x));
            }
            System.out.println();
        }
    }
}
