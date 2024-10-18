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
        // "[" + sb.toString() 이랑 같음 -> 문자열 더하기 객체 주소값이라 toString 을 더해줌
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
    public static int[] copyOf(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
    public static int[] copyOf(int[] arr , int n1) {
        int[] temp = new int[n1];
        for (int i = 0; i < n1; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

}