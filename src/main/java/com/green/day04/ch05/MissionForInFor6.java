package com.green.day04.ch05;

public class MissionForInFor6 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6) + 3;

        System.out.println(star);
        for (int i=star; i>0; i--){
            for(int j=1; j<=star; j++){
                System.out.print(j < i ? "-" : "*");
            }
            System.out.println();
        }
    }
}
