package com.green.day08.ch13;

public class ArrayInit {
    public static void main(String[] args) {
        int [] arr = new int[5];

        /*
        0 : 10
        1 : 20
        2 : 30
        3 : 40
        4 : 50
         */

        for (int i=0; i<arr.length; i++) {
            arr[i] = (i+1) * 10; // for 문 두개 쓰더라도 읽기 , 쓰기 따로 하는걸 추천 !
        }

        for (int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]:%d\n",i,arr[i]);
        }

    }
}
