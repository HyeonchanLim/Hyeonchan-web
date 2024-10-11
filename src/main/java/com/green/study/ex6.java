package com.green.study;

public class ex6 {
    public static void main(String[] args) {
        int n = 1;
        boolean search = false;

        while (n <=200){
            if ((n%6)==0 && (n%9)==0){
                search = true;
                break;
            }
            n++;
        }
        if (search) {
            System.out.printf("찾는 정수 : %d" , n);
        } else {
            System.out.println("못 찾음");
        }
    }
}
