package com.green.day14.ch17;
/*
class 가 클래스를 상속받을 때 키워드 : extends
interface 가 interface 를 상속받을 때 키워드 : extends
같은 타입의 클래스는 extends 키워드를 사용

class 가 interface 를 상속받을 때 키워드 : implements
다른 타입의 클래스를 상속받아서 implements

interface 는 class 를 상속받을 수 없다.
 */


public class PrinterDriver3 {
    public static void main(String[] args) {
        //자식 타입에 부모객체 주소값 담은 경우
        // Prn204Drv가 상속을 어디까지 받았는지 확인하면 Printable 까지 상속받았고
        // Printable 은 ColorPrintable 보다 부모타입이기 때문에 담을 수 없다.
//        ColorPrintable cp = (ColorPrintable) new Prn204Drv();
//        cp.printCMYK("dddd");
        // ColorPrintable(Prn204Drv자식) = extends 키워드
        // Prn204Drv(ColorPrintable부모) = implements
    }
}

interface ColorPrintable extends Printable { // 인터페이스가 인터페이스를 상속 받으면 extends 로 작성하고
    void printCMYK(String doc);

}

//Prn9090Drv 객체의 주소값 담을 수 있는 타입 : Printable , ColorPrintable , Prn9090Drv
// Prn9090Drv 타입으로 호출할 수 있는 메소드 : printCMYK , print
// ColorPrintable 타입으로 호출할 수 있는 메소드 : printCMYK , print
// Printable 타입으로 호출할 수 있는 메소드 : print

class Prn909Drv implements ColorPrintable{
    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
}

// 빛의 3원소 (RGB) - RED GREEN BLUE
// CMYK - CYAN MAGENTA YELLOW KEY(검정) / 인쇄를 위한 색상 모드

// 이미지표현방식 : bitmap방식 , vector방식
