package com.green.study;

public class ex1 {
    public static void main(String[] args) {
        for (int a=1; a<10; a++){
            for (int b=1; b<10; b++){
                if ((a*10+b + b*10+a )==121){
                    System.out.printf("%d,%d\n",a,b);
                }
            }
        }
    }
}
