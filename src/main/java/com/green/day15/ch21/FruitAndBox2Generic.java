package com.green.day15.ch21;

public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox = new BoxGeneric<>(new Apple());
        Apple apple = appleBox.getBox();

        BoxGeneric<Orange> orangeBox = new BoxGeneric<Orange>(new Orange());
        Orange orange = orangeBox.getBox();

//        FruitBoxGeneric<Orange> orangeBox = new FruitBoxGeneric<Orange>(new Orange());
//        new 부분에서 <> 를 생략하면 객체는 타입이 제네릭의 타입은 Object가 됨
//        타입에 적은 <Orange>로 형변환을 하는 것으로 예상
//        new 부분에 <> 를 작성하는 것이 성능에 도움이 된다.
    }
}

class BoxGeneric<T> { // T -> 타입 정해지지 않았음 나중에 타입 정하면 바꾸겠다 의미 , 생략하면 Object 타입
    private T fruit;
    BoxGeneric(T fruit){
        this.fruit=fruit;
    }
    T getBox(){
        return this.fruit;
    }
}
