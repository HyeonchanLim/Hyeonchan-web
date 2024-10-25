package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {

        //Report0~3까지 객체화 해주세요.
        String contents = "Simple Funny News~";
        Printable2 r0 = new Report0(contents);
        Printable2 r1 = new Report1();
        Printable2 r2 = new Report2();
        Printable2 r3 = new Report3();

//Printer 클래스 아래에 있는 printContents메소드 호출하고 싶어요
//호출할 때 r0의 주소값을 보내주세요.
        Printer printer = new Printer();
        printer.PrintContents(r0);
        printer.PrintContents(r1);
        printer.PrintContents(r2);
        printer.PrintContents(r3);


    }
}

interface Printable2 {
    public abstract String getContents();
}
interface Upper {}
interface Lower {}

class Report0 extends Object implements Printable2  {
    private String contents;
    public Report0(String contents){
        this.contents = contents;
    }
    @Override
    public String getContents() { //getter 라서 변수명 맞춰주기
        return contents;
    }
}
class Report1 implements Printable2 , Lower {
    public String getContents(){
        return "Simple Funny News~";
    }
}
class Report2 implements Printable2 , Upper {
    public String getContents(){
        return "Simple Funny News~";
    }
}
class Report3 implements Printable2 , Upper , Lower {
    public String getContents(){
        return "Simple Funny News~";
    }
}

class Printer {
    public void PrintContents (Printable2 doc){
        if (doc instanceof Upper){
            System.out.println(doc.getContents().toUpperCase());
            //doc.getContents() 가 가져오는 데이터는 String getContents 으로 정해놨기 때문에 int를 가져오지 못함
            //toUpperCase() 대문자로
        } else if (doc instanceof Lower){
            String str = doc.getContents();
            System.out.println(str.toLowerCase());
            //toLowerCase() 소문자로 / 위의 print랑 같음.
        } else {
            System.out.println(doc.getContents());
        }
    }
}
