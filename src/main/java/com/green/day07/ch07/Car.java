package com.green.day07.ch07;

public class Car {
    private String color;
    private String gearType; // auto , manual
    private int door;

    public void introduce () {
        // this("dd","ddd",11) -> 생성자는 객체 생성시에만 호출 가능 , introduce 는 객체 생성 이후라 this() 사용 불가
        System.out.printf("%s 컬러의  %s 기어를 가진 %d개의 문짝이 있는 자동차\n" , color , gearType , door);
    }

    // 기본생성자처럼 기본값을 설정해서 white , auto , 4 가 나오게함  ex) Car c1 = new Car();

    public  Car(){

    }
    public Car(String gearType , int door){
        //color = "white";
        //gearType = "auto";
        //door = 4;

        /*
        this 사용법 2가지
        1. this.    : 멤버필드 , 멤버메소드 사용하고 싶을 때 , this. 생략가능할 때가 있다.
        2. this()   : 생성자에서 다른 생성자 호출시 사용 가능
         */
        this("white" ,gearType,door); // 기본생성자로 객체 생성시 항상 "white" 같은 값이 나옴 - 하드코딩

        //this.introduce();
        // introduce();
        // 생성자에서 생성자 호출이 가능함 밑에 Car 생성자에서 타입을 만들어 놨어서 참고를함
    }

    // 생성자 작성 , Car c3 = new Car ("red" , "auto" , 4); 설정했는 값이 각 타입에 맞는 부분에 들어감
    public Car (String col , String gear , int r) {
        this.color = col; // 매개변수명이 멤버필드명과 달랐다면 this. 을 생략할 수 있었다.
        this.gearType = gear;
        this.door = r;
    }

}

class CarTest {
    public static void main(String[] args) {
        // main 메소드의 내용을 수정하지 않고
        // 생성자를 이용하여 아래 문구 출력
        // "white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차"

        Car c1 = new Car();
        c1.introduce();

        Car c2 = new Car();
        c2.introduce();

        Car c3 = new Car ("red" , "auto" , 4 );
        c3.introduce();

        Car c4 = new Car("auto" , 6);
        c4.introduce();
        //white컬러의 auto를 가진 6개의 문짝
    }
}
