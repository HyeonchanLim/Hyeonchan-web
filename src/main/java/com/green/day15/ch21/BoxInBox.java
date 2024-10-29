package com.green.day15.ch21;

public class BoxInBox {
    public static void main(String[] args) {
        String str = "I am so happy.";
        BoxGeneric<String> sBox = new BoxGeneric<>(str);

        BoxGeneric<BoxGeneric<String>> wBox = new BoxGeneric<>(sBox);
        //sBox 객체 주소를 wBox 에 저장

        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zBox = new BoxGeneric<>(wBox);

        BoxGeneric<BoxGeneric<String>> wBox2 = zBox.getBox();
        //zBox 객체는 wBox를 가르킨다
        BoxGeneric<String> sBox2 = wBox2.getBox();
        String str2 = sBox2.getBox();
        System.out.println("wBox == wBox2 : " + (wBox == wBox2)); // false
    }
}

