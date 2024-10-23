package com.green.day11.ch16;

public class OverridingEquals {
    public static void main(String[] args) {
        String s1 = new String("10");
        String s2 = new String("10");
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);
        NumBox n3 = new NumBox(13);

        System.out.println("s1 == s2" + (s1 == s2));
        System.out.println("s1.equals(s2)" + s1.equals(s2));
        System.out.println("n1.equals(n2)" + (n1.equals(n2)));


        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);

        // 레퍼런스 변수끼리의 == 비교는 주소값 비교(동일성 비교)
        // 생성자로 2번 호출되면서 각각 객체 생성으로 만든 주소값을 가지고 있어서 주소값이 달라짐
        // 즉 2개의 NumBox 객체가 만들어졌다.

        System.out.println("n1 == n2" + (n1 == n2)); // 주소값 비교
        System.out.println("n1.equals(n2)" + (n1.equals(n2))); // 출력값 비교
        System.out.println("n1.equals(n2)" + (n1.equals(n2))); // 출력값 비교
        System.out.println("n1.equals(n3)" + (n1.equals(n3))); // 출력값 비교
    }
}

class NumBox {
    private int num;

    NumBox (int num){
        this.num = num;
    }

    @Override
    public boolean equals (Object object){ //
        if(!(object instanceof NumBox)){
            return false;
        }
        NumBox nb = (NumBox)object;
        return this.num == nb.getNum();
        //return this.num = nb.num;
    }
    //문자열로도 해결할 수 있으나 퍼포먼스(성능)가 좋지 않기 때문에 비추천
    public boolean equals2(Object object){
        if(!(object instanceof NumBox)){
            return false;
        }
        return toString().equals(object.toString());
    }
    int getNum(){
        return  num;
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
