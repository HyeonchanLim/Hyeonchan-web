package com.green.day08.ch13;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10 , 15 , 23 , 1, 8};
        int[] copyArr = new int[arr.length];

        for (int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }
        System.out.println("arr == copyarr:" + (arr==copyArr));
        // 같은 값을 가져와서 복사 -> deep copy
        //참조변수끼리의 == 비교는 동일성 (같은 주소값)을 묻는다 여기서는 동등성

        int[] arr2 = copyArr; // 얕은 복사 shallow copy 여기서는 동일성 - 같은 주소값 복사
        System.out.println("arr2 == copyarr:" + (arr2==copyArr));


        System.out.println("-----");
        // 밑에는 절대 터치 x
        for (int i=0; i<arr.length; i++){
        System.out.printf("arr[%d]:%d\n",i,arr[i]);
        }

        System.out.println("-----");

        for (int i=0; i<arr.length; i++) {
            System.out.printf("copyArr[%d]:%d\n" , i , copyArr[i]);
        }
    }
}
