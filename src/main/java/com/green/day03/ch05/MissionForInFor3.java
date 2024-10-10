package com.green.day03.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6)+3; // 3~8사이 랜덤 숫자
        for (int i=1; i<=star; i++) {
            for (int j = 1; j <= star; j++) {
            System.out.print("*");
            }
        System.out.println();
        }
        System.out.println("----");


        int len = star * star;
        for ( int i = 1; i <= len; i++) {
            System.out.print("*");
            if (i % star == 0) {
                System.out.println();
            }
        }
    }
}
