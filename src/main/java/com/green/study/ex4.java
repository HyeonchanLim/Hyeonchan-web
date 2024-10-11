package com.green.study;

public class ex4 {
    public static void main(String[] args) {
        int star  = (int)(Math.random()*10)+1;
        System.out.println(star);

        for (int i=star; i>0; i--){
            for (int j=0; j<star; j++){
                System.out.print(j<star-i ? " " : "*");
            }
            System.out.println();
        }
        System.out.println("----");

    }
}
