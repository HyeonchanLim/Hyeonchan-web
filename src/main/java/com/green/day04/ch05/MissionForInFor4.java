package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        /*

         */

        int star = (int)(Math.random()*6)+3;
        // =8

        for (int i = 1; i<=star; i++){
            for (int j=0; j<i; j++){
               System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---");

        for (int i = 0; i<star; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = star - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
