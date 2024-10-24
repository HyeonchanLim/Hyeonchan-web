package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        clear();
    }
//    public MyArrayList (int arr){
//        this.arr = arr;
//    }

    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i=0; i<arr.length; i++){
//            sb.append(arr[i]);
//            sb.append(", ");
//        }
//        sb.delete(sb.length()-2,sb.length());
//        return "[" + sb + "]";
//    }
    public String toString() {
        if(arr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(arr[0]);
        for (int i=1; i<arr.length; i++){
            sb.append(", ");
            sb.append(arr[i]);
        }
    sb.append("]");
        return sb.toString();
    }

    public void add (int num){
        int[] tmp = new int[arr.length+1]; // 배열 길이 +1 -> tmp에 저장
        for (int i=0; i<arr.length; i++){ // for문으로 반복횟수 지정 -> 각 배열 위치마다 입력값 저장
            tmp[i]=arr[i]; // for문이 돌아가면서 tmp 배열의 0번부터 마지막 배열까지 arr 배열의 값들을 저장
        }
        tmp[arr.length]=num; // tmp배열 현재 위치값 (arr.length+1) 에 매개변수 num 저장
        arr=tmp; // tmp배열에 저장된 데이터들을 arr 배열로 전송
    }

    public int size () {
        return arr.length;
    }

    public void clear (){
        arr = new int[0];
    }

    int remove (int n1) {
        //0일 경우인 예외 상황 만들어둬야함

        int[] tmp = new int[arr.length-1];
        for (int i=0; i<tmp.length; i++){
            tmp[i]=arr[i];
        }
        int tmp2 = arr[arr.length-1];
        arr=tmp;
        return tmp2;
    }

//    public void add (int num1 , int num2){
//        int[] tmp = new int[arr.length+1]; // 배열 길이 +1 -> tmp에 저장
//        for (int i=0; i<arr.length; i++){
//        arr[i]=num1;
//        }
//        tmp[arr.length]=num2;
//        arr.tmp;
//    }

}
