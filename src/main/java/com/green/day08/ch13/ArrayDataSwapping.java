package com.green.day08.ch13;

import java.util.Arrays;

public class ArrayDataSwapping {
    public static void main(String[] args) {
        int arr[] = {10 ,20 ,30};

        int temp;
        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println(Arrays.toString(arr));
        //arr 0방의 값과 arr2방의 값을 스와핑해주세요
    }
}
