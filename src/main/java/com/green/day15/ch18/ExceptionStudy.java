package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args) {
        String str1 = "123";
        int intVal1 = myParseInt(str1);
        System.out.println(intVal1);


        String str2 = "123a";
        int intVal2 = myParseInt(str2); //예외 발생없이 0을 리턴하는 메소드를 만들고 싶음
        System.out.println(intVal2);

    }
    //1. myParseInt가 메소드인지는 (str1)을 보고 알았다.
    //2. myParseInt 앞에 . 을 붙이지 않았기 때문에 같은 class 안에 있는 메소드
    //3. 2번 내용과 일맥상통하게 . 을 붙이지 않았다는 것은 객체화를 하지 않았다는 의미 -> Static 메소드
    //4. myParseInt(str1) 앞에 "int intVal1 =" 코드가 있었기 때문에 리턴(int) 메소드
    //5. 리턴타입은 int라는 것을 알 수 있었다.
    //6. 파라미터는 str1의 타입이 String이기 때문에 파라미터 타입도 String

    public static int myParseInt (String str1){
        try {
            return Integer.parseInt(str1);
        }catch (Exception e){
            return 0;
            // catch 문 실행 후 return을 시켜줘야함 why? -> 현재 try가 반환 타입이 있는 메소드 안에 작성을 해서
        }
    }

}
