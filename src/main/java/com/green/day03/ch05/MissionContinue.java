package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {

        int count = 0;
        for (int n=1; n<100; n++){
                if (((n%5)==0) && ((n%7)==0)) {
                count++;
            System.out.println("n: " + n);
            }
        }
        System.out.println("count :" + count);
        /*
        int count = 0;
        boolean search = false;
        for (int n=1; n<100; n++) {
            if (((n % 5) != 0) || ((n % 7) != 0)) {
                search = true;
                break;
            }
            if (search) {
                System.out.printf("%d : %d\n", n, count);
            } else {
                System.out.println("못찾음");
            }
        }
        */
    }
}
