package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        /*
        ClassC는 B를 상속 , B는 A를 상속
        super 생성자 호출은 자식 생성자 코드에서 최상위에 위치해야 한다.
         */
        ClassC c = new ClassC();
    }
}
// ClassC 는 B를 상속
class ClassA {
    ClassA(){
        super();
        System.out.println("====ClassA====");
    }
}
class ClassB extends ClassA{
    ClassB(){
        super();// 조상인 ClassA의 기본 생성자 실행하고 B의 기본 생성자 실행
        System.out.println("====ClassB====");
    }
}
class ClassC extends ClassB{ // java에서는 다중 상속이 안된다 ex) extends ClassB , ClassA  / C++ 에서는 가능
    ClassC(){
        super(); // 조상인 ClassB의 기본 생성자 실행하고 C의 기본 생성자 실행
        System.out.println("====ClassC====");
    }
}
