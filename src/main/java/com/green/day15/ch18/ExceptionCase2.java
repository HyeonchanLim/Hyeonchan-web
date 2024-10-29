package com.green.day15.ch18;

public class ExceptionCase2 {
    public static void main(String[] args) {
        /*
        try - catch 문 ( 예외처리 )
        try 문에 에러가 날 가능성이 있는 코드를 위치한다.
        만약에 예외가 발생이 된다면 catch부분이 실행이 된다.
        예외가 발생되지 않는다면 catch부분이 실행이 되지 않는다.
        if문과 유사함
         */
        int n1 = 10;
        int n2 = 0;

        try {
            System.out.printf("%d / %d = %d\n" , n1 ,n2 ,(n1/n2) );
        } catch (ArithmeticException e){
            e.printStackTrace(); // try-catch문이 없었다면 콘솔에서 봤을 에러 문장 출력
            System.out.println(e.getMessage());
            //getMessage 는 예외처리 최상위 부모인 Throwable 에 있는 message 를 오버로딩해서 가져옴
        }
        System.out.println("==end==");
    }
}
