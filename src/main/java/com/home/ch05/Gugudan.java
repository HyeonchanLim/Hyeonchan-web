package com.home.ch05;

public class Gugudan {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++){
            System.out.println("------");
            for (int j = 0; j < 9; j++){
                System.out.print("["+ i + ", " + j + "]");
            }
            System.out.println('\n');
        }
    }
}
