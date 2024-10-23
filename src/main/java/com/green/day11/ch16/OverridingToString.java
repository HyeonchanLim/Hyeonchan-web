package com.green.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake c = new Cake();
        System.out.println(c);
        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake);

        System.out.println(c.equals(c.toString()));// 앞에 c는 cake c의 cake를 가르키고 c.toString은 String타입 리턴
        Cake c2 = cheeseCake;
        System.out.println(c2); // 실행이 된다면 cheeseCake 나 c2나 똑같다.
        // 메소드 중 가장 먼저 만나는 자손 클래스의 메소드를 만나서 CheeseCake 의 toString 이 실행된다.


    }
}

class Cake {
    @Override // 오버라이딩 실수 방지용 , 오버라이딩이 아니면 컴파일 에러
    public String toString(){
        return "My birthday cake";
    }
    final void blowCandle() {// final 을 붙이면 오버라이딩을 못함.
        System.out.println("초를 분다.");
    }
}
// class 앞에 final 키워드가 있으면 상속 금지
// 대표적으로 String 클래스는 상속이 불가능
final class CheeseCake extends Cake {
    @Override
    public String toString(){
        return "My birthday cheese cake";
    }
// 자식에서 blowCandle 오버라이딩을 할 수 없다.부모메소드에 final 키워드가 있기 때문
//    void blowCandle() {
//    System.out.println("초를 분다.");
//    }
}
// CheeseCake 클래스에 final이 붙어서 상속을 못한다.
// class chocolateCheeseCake extends CheeseCake {}
