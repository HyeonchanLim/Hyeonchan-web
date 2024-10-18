package com.green.day09.ch13;

public class MyArrays {
    public static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        return "[" + sb + "]";
    }

    public static String toString3(int[] arr){
        if(arr.length == 0){ // [] 배열안에 값이 없을 경우 [] 리턴해서 출력
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]); // 배열 첫번째 값을 출력부터 하고 for문으로 반복
        for (int i=1; i<arr.length; i++){
            sb.append(", ");
            sb.append("arr[i]");
        }
        return sb.append("]").toString();
    }
}