package com.green.day03.ch05;

public class InfinityLoop {
    public static void main(String[] args) {
        int n = 1;
        while (true){ // while , true 를 쓰면 무한루프가 된다
            if(((n%6)==0) && ((n%14)==0)) {
                break; // 무한루프라도 조건식과 break가 잇으면 멈춘다
            }
            n++;
        }
        System.out.printf("n: %d\n" , n);
    }
}
