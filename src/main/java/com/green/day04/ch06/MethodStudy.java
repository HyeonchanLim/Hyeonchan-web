package com.green.day04.ch06;

public class MethodStudy {
    /*
     아래를 main 메소드라고 부른다
     메소드를 만드는 행위는 '메소드를 정의했다' 라고 표현한다.
     만든 메소드를 사용하는 행위를 '메소드를 호출했다' 라고 표현한다.

     메소드는  4가지 구성요소가 있다
     void - 리턴타입 : 메소드 호출된 후 결과값
     main - 메소드명 : 호출할 때 사용
     (String[] args) - 파라미터 , 매개변수 : 메소드에 보내는 데이터
     {} - 구현부 : 호출되었을 때 실행되는 부분

     (리턴타입 + 메소드명 + 파라미터) = 선언부

     메소드를 크게 두 분류
     void 메소드 - 리턴하는 값이 없다. 결과값이 없음

     return 메소드 (비void 메소드) - 리턴하는 값이 있다. 결과값이 있음
     */
    public static void main(String[] args) {
        MethodStudy.sum(1,10,"11"); // sum 메소드를 호출 , 클래스명.메소드
        sum(20,15,"125"); // 메소드 단일이면 void 메소드일 확률이 높음
        int result = returnSum(5,7); // 타입 + 메소드 면 return메소드일 확률이 높음

        System.out.println("result = " + result);
    }


    // sum 메소드를 정의했고 정수타입 n1 과 n2를 선언했다 .
    // 여기서 메소드의 n1 , n2를 메인 메소드에 있는 sum(n1,n2)를 호출하여 밑에 n1 , n2에 대입
    static void sum(int n1, int n2 , String n3){
        System.out.printf("%d + %d = %s\n" ,n1, n2, n3);
    }
    static int returnSum(int n1 , int n2) {
        return  n1 + n2;
    }
}
