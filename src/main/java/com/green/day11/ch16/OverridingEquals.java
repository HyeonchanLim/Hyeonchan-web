package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        System.out.println("n1.equals(n2)" + (n1.equals(n2)));

        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);

        // 레퍼런스 변수끼리의 == 비교는 주소값 비교(동일성 비교)
        // 생성자로 2번 호출되면서 각각 객체 생성으로 만든 주소값을 가지고 있어서 주소값이 달라짐
        // 즉 2개의 NumBox 객체가 만들어졌다.
        System.out.println("n1 == n2" + (n1 == n2));
        System.out.println("n1.equals(n2)" + (n1.equals(n2)));
    }
}

class NumBox {
    private int num;

    NumBox (int num){
        this.num = num;
    }

    @Override
    public boolean equals (Object object){
        return false;
    }

    @Override
    public String toString(){
        return String.valueOf(num); //valueOf - 문자열 전환
        // 메소드 : (인자) <- 소괄호 인자가 보여서 메소드
        // static 메소드 : 클래스 . 메소드 잇어서
        // 리턴 타입이 String
        // 파라미터는 int 타입
    }
}
