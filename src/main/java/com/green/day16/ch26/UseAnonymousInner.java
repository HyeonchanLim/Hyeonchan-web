package com.green.day16.ch26;

// p.653 익명 클래스
// 익명 클래스는 interface를 implements한 클래스를 만들지 않고 다이렉트로
// interface를 implements한 클래스를 객체화 할 때 사용할 수 있다.
// 즉 코드 작성을 많이 생략 가능함.
// 익명 클래스 작성보다 더 많이 생략할 수 있는게 람다식이다.
// 람다식을 작성할 수 있는 interface는 오로지 추상메소드 하나만 가지고 있는 경우만 가능.
// 그래서 보통 람다식을 사용하는 interface 는 @FunctionalInterface 애노테이션이 붙어있다.
// 이 애노테이션은 2개의 추상메소드가 있으면 컴파일 에러를 터뜨린다.

// 인터페이스는 추상메소드로 이루어져서 객체화가 이루어지지 않음
// 아래는 가져와서 객체화가 된 거 같지만 implements로 받지 않았음
// UseAnonymousOriginal 클래스 처럼 클래스 상속받고 구현해야하지만
// 여기서는 클래스 이름 없는 익명성으로 implements 했다고 생각하면 됨
//Printable p = new Printable()  여기서 implements
public class UseAnonymousInner {
    public static void main(String[] args) {
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("익명 클래스 print");
            }
        };
        p.print();

        Printable p2 = () -> {
            System.out.println("람다 print");
        };
        p2.print();

        // 추상메소드 두개 이상 부터는 람다식이 불가능하다.
        Printable p3 = () -> System.out.println("람다 print");
        p3.print();

        /*
        () 파라미터 부분
        -> 람다식 시작 부분
        {} 중괄호 생략 가능한 경우는 명령이 한줄인 경우 생략 가능하다.
         */

    }
}

//@FunctionalInterface // 추상메소드 하나인지 체크해줌 두개 이상이면 문제 있다고 알려줌
interface Printable {
    void print();
//    void print2();
}