package com.green.day03.ch05;

public class BreakBasic {
    public static void main(String[] args) {
        int n = 1;
        boolean search = false;
        while (n<100) {
            if(((n%5)==0) && ((n%7)==0)) {
            search = true;
            break;
            }
            n++;
        }
        if(search){
            System.out.printf("찾는 정수 : %d\n" , n); // while문에서 search가 true 변경되면 여기서 출력 , 그대로 false면 else로
        } else {
            System.out.println("못 찾음");
        }
    }
}