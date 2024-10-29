package com.green.day15.ch21;

import com.green.day01.ch01.SystemOutPrintln;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox = new FruitBox(new Apple());
        FruitBox orangeBox = new FruitBox(new Orange());
        Apple apple = (Apple)appleBox.getFruit();
        Orange orange = (Orange) orangeBox.getFruit();

        FruitBox orangeBox2 = new FruitBox("오렌지");
//        Orange orange2 = (Orange) orangeBox2.getFruit();

        System.out.println("----");
    }
}

class FruitBox{
    private Object fruit;

    FruitBox (Object fruit){
        this.fruit=fruit;
    }
    Object getFruit (){
        return fruit;
    }
}