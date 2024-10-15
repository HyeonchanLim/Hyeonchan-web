package com.green.day06.ch07;

/*
일반 변수 (primitive type)
참조 변수 (reference type)
차이점을 설명하는 예제
 */

public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {
        int num = 10; //

        changeNum(num); // changeNum 메소드에 위의 int num = 10; 이라는 주소값을 참고
        System.out.println("num : "+num); // changeNum 메소드의 int num이 아닌 main 메소드의 int num=10;을 가져옴

        NumberBox nb = new NumberBox(); // NumberBox만 저장 가능한 새로운 객체를 생성하고 nb라는 변수에 저장
        nb.num = 10; // 새로 만든 nb 에 10을 저장
        changeNum(nb); //changeNum 메소드에서 nb(10)의 주소값을 가져감
        System.out.println("nb.num" + nb.num);
    }
        /*
        main 메소드에 있는 num 변수(main num)와 changeNum메소드에 있는 num매개변수 (m-num)는 다른 공간이다.
        main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
        m-num값을 변경한다고 하여 main-num 값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문.
         */
    public static void changeNum(int num){
        num = 100;
    }
        /*
        main 메소드에 있는 nb 변수(main-nb)와 changeNum 메소드에 있는 nb 매개변수(m-nb)는 다른 공간이다.
        다만 같은 값(주소값)을 가지고 있다. 그로인해 같은 객체에 접근할 수 있다.
        m-nb를 통해 객체의 num 값을 변경을 했다면 main-nb를 통해 접근하면 변경된 값은 얻게 된다.
         */
    public static void changeNum(NumberBox nb){
        // 같은 changeNum 메소드명이지만 위에는 int num , 밑에는 numberbox nb를 주소값을 참조한 값이라 메소드명 겹쳐서 써도 됨 오버로딩이 가능하다.
        nb = new NumberBox(); // 이렇게 하면 10 , 없으면 100
        nb.num=100;
    }
}

    class NumberBox{
    int num;
    }