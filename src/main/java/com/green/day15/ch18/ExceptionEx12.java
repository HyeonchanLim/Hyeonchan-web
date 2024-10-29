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
    }
}
