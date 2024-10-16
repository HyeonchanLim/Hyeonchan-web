package com.green.day07.ch10;

public class StaticStudy {
    public static void main(String[] args) {
        NonStaticNumBox nnb1 = new NonStaticNumBox();
        nnb1.n1=10;
        nnb1.n2=30;

        NonStaticNumBox nnb2 = new NonStaticNumBox();
        nnb2.n1=15;
        nnb2.n2=20;

        nnb1.sum();
        nnb2.sum();
        // 들어오는 값
        System.out.println("----");

        StaticNumBox snb1 = new StaticNumBox();
        snb1.n1 = 10;
        snb1.n2 = 30;

        StaticNumBox snb2 = new StaticNumBox();
        snb2.n1 = 15;
        snb2.n2 = 30;

        snb1.sum();
        snb2.sum();
        // snb1.n1 , snb2.n1 랑 같은 공간을 쓰는거라 마지막에 들어온 15 의 데이터가 최종값으로 계산
        /*
        객체마다 멤버필드의 공간이 각각 생기길 원하면 non-static(인스턴스 멤버필드)로 해야한다.
        (각 개체마다 다른값을 저장하고 싶다면)

        static 을 사용할 수 있으면 (위 두줄의 내용과 반대되는 경우) 적극 사용하는 걸 추천
        왜냐면 실행 속도가 빠르고 사용하기 편하다. (객체 생성이 필요하지 않기 때문)
         */
        StaticNumBox.n1=50;
        StaticNumBox.n2=70;
        StaticNumBox.sum(); // 120
        StaticNumBox.sum(150,160); // 310 , 53 줄 참고

        // 클래스 멤버필드 , 메소드는 위 처럼 사용할 수 있다.
        // 매개변수만 이용하여 해결하는 메소드는 static 메소드로 만들면 좋다.
        // (멤버필드 사용하지 않는 경우)

        Math.random(); // Math 클래스 안에 있는 random 이름의 static method
        // Math math = new Math();
        // math.random();
        // Math()'이(가) 'java. lang. Math'에서 private 액세스를 가집니다.
        // 이렇게 두 줄을 통해서 메소드를 호출할 필요가 없기 때문에 static 메소드가 사용이 편하다.
        // 그리고 Math 클래스는 객체화를 할 수 없다. 이유는 기본 생성자 접근 레벨을 private으로 세팅했기 때문
        // Math()  객체생성을 막기 위해
    }
}

class StaticNumBox {
    static int n1;
    static int n2;
    int n3;
    int n4;

    static void sum(int n1 , int n2) {
        System.out.println(n1 + n2);
    }
    // static int sum () {return 0;} // void 리턴 상관없이 파라미터만 다르면 오버로딩 다 가능함 메소드명 동일해야함

    static void sum() {
        System.out.println(n1 + n2);
        // System.out.println(n3 + n4); // static 메소드에서 인스턴스 멤버필드 접근 불가
        // hello(); static 메소드에서 인스턴스 메소드 호출 불가.
    }

    void hello() {
        System.out.println("Hello");
    }
}

class NonStaticNumBox {
    int n1;
    int n2;
    static int n3;
    static int n4;

    void sum () {
        System.out.println(n1 + n2);
        System.out.println(n3+n4); // 인스턴스 메소드에서 클래스 멤버필드 접근 가능
        hello(); // 인스턴스 메소드에서 클래스 멤버메소드 호출 가능하다.
        // 왜 가능하냐면 sum() 메소드가 호출이 된다는 것은 nonStaticNumBox 가
        // 객체화가 되었다는 것이고 static 은 이미 메모리에 올라가 있기 때문에 사용이 가능하다.
        // static 을 붙이면 이미 객체화가 되어 메모리에 등록되었기 때문에 어디서든 호출이 되지만 인스턴스는 객체화를 안하면 불가능
    }
    static void hello () {
        System.out.println("Hello");
    }
}