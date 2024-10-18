package com.green.day09.ch13;

public class Mission13_1 {
    public static void main(String[] args) {
         /*
        int 형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최댓값 , 최솟값을 찾아서 반환하는 메소드를 각각 다음의 형태로 정의하자.

        public static int minValue(int[] arr)
        public static int maxValue(int[] arr)

        단 반복문을 사용할 때 minValue 의 정의에서는 일반적인 for문을 사용
        maxValue의 정의에서는 enhanced - for 문을 사용하자
         */
        int[] arr = {43, 88, 100, 3, 220};
        int min = minValue(arr);
        int max = maxValue(arr);

        System.out.printf("최댓값 : %d , 최솟값 : %d", max, min);
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr) {
        int max = 0;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
