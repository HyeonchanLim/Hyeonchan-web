package com.green.study.day01;

public class ForInFor {

    public static void main(String[] args) {

        int star = (int)(Math.random() * 10.0) + 1;

        for (int i = star; i >= 1; i--) {
            for(int z = 1; z <= star; z++) {
                System.out.print(z < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}
