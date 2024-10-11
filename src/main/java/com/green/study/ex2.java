package com.green.study;

public class ex2 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*10)+1;

        for (int i=1; i<star; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
