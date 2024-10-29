package com.green.day15.ch18;

public class ExceptionEx12 {
    public static void main(String[] args) {
        // 메인 메소드는 첫시작 부분이라서 throw 사용 불가능 / 여기서 마무리
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----end----");
    }
    static void method1() throws Exception{
        method2();
    }
    static void method2() throws Exception{
        throw new Exception("haha");
        // throws 메소드에서만 사용할 수 있는게 아니라 예외를 일부로 발생시키고 싶을 때 사용 가능
        /*
        메인 메소드에서 try - catch 를 작성하고 try 에 method1 을 호출하고 예외처리가 발생할 수 있다는걸 알림
        method1 에서 throws Exception 을 추가해서 예외가 발생할 수 있다는걸 알리고 method2를 호출
        만약 예외처리가 없으면 메인 메소드 , 발생하면 method2를 호출
        발생했다면 method2로 넘어오고 여기서도 throws Exception 으로 예외가 발생할 수 있다는걸 알리고
        만약 예외 처리가 발생했다면 throw new Exception ("haha") 에 있는 haha 를 발생하게 만듬
        발생했다면 메인메소드의 catch 로 넘어와서 getMessage 에서 haha 가 출력
         */
    }
}
