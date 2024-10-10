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


        int len = star * star; // 5*5 = 25 -> len
        for ( int i = 1; i <= len; i++) { // i<=25 , i++
            System.out.print("*");
            if (i % star == 0) { // 25 / 5 == 0 -> 5별 -> 5별 찍히면 개행
                System.out.println();
            }
        }
        // 2~9 랜덤숫자 별찍기
        int star2 = (int)(Math.random()*8)+2;
        for (int i=1; i<=star2; i++){
            System.out.print("*");
            if (i%star2==0){
                System.out.println();
            }
        }
    }
}
