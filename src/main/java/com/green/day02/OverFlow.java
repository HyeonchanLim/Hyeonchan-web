package com.green.day02;

public class OverFlow {
    public static void main(String[] args) {
        /*
        5리터 컵에 5리터 이상의 물을 넣었을 때 , 물이 넘침 -> 오버플로우 현상
        100까지 저장할 수 있는 곳에 101이상을 저장하게 되면 오버플로우 현상이 나타남

        ex) byte - 양수 127까지 저장이지만 128을 넣으면 오버플로우 현상 발생
            byte - -128~127까지 저장가능
         */

        byte var1=127;
        System.out.println(var1);
        System.out.printf("var1 : %d\n" , var1); // var1 -> 127 최대치까지
        byte var2 = (byte) 128;
        System.out.printf("var2 : %d\n" , var2); // var2 -> 127 최대치 +1 -> -128 로 변경


    }
}
