package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    public static void main(String[] args) {
        /*
        다음 메소드는 int형 1차원 배열에 저장된 값을 두 번째 매개변수로 전달된 값의 크기만큼 전부 증가시킨다.

        public static void addOneDArr(int[] arr, int add) {

        }
         */
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        addOneDArr(arr, 3); // 2번째 인자의 값을 모든 방에 더해준다.
        System.out.println(Arrays.toString(arr));
        int[][] arr2 = {
                {1, 2, 3, 4, 5},
                {4, 5, 6}
        };
        addTwoDArr(arr2, 4);
        System.out.println(Arrays.deepToString(arr2));
        //int[] 객체의 각 방의 타입 : int
        //int[][] 객체의 각 방의 타입 : int[]
    }

    public static void addTwoDArr(int[][] arr2, int add) {
        for (int i = 0; i < arr2.length; i++) {
//                for (int i2=0; i2<arr2.length; i2++){
//                    arr2[i][i2] += add;
//                }
            addOneDArr(arr2[i], add);
        }
    }

    public static void addOneDArr(int[] arr, int add) {
        /*
        for (int item : arr )
        item += 3;
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) + add; // arr[i] = 이 수식이 있어야 배열의 주소값에 있는 데이터를 변경함
        }
    }
}
