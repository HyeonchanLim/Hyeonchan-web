package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        for (int dan=1; dan<10; dan++){
            for (int i=2; i<10; i++){
                System.out.printf("%d x %d = %d\t" , i , dan , (i*dan));
            }
        System.out.println();
        }
        System.out.println("----");

        for (int i=2; i<10; i++){
            //System.out.printf("\t");
            for (int dan=1; dan<10; dan++){
                System.out.printf("%d x %d = %d " , dan , i , (i*dan));
            }
            System.out.println();
        }
        System.out.println("----");
    }
}
