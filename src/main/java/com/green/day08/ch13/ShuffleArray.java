package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i=1; i<=arr.length; i++){
            arr[i-1] += i;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("----");

        int temp;

        for (int i=0; i<arr.length; i++){
            temp = arr[i];
            int rIdx = (int)(Math.random()*arr.length);
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
