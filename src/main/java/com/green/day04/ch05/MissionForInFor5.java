package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6)+3;

        int k = star;
        System.out.println(star);

        for (int i=1; i<=star; i++){
            for(int j=star; j>=1; j--){
                if ( j>i ) {
                    System.out.print("-");
                }
                System.out.println("*");
            }
        }

        for (int i=1; i<=star; i++){
            for(int j=star; j>i; j--){
                System.out.print("-");
            }
            for (int a = 0; a<i; a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
star 3 ->
공백은 star -1 -> 0

*은 1에서 star까지 증가
 */