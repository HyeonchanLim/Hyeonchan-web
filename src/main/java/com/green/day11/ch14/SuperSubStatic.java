package com.green.day11.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS sub1 = new SubCLS();
        // SubCLS 의 기본생성자 super(); 로 조상클래스 SuperCLS 의 기본생성자 count++로 총 3 count
        sub1.showCount(); // 3
    }
}

class SuperCLS {
    protected static int count; // protected 는 현재 클래스 + 조상 클래스까지 허용 범위 / public 보다 아래

    //SuperCLS 클래스의 기본생성자에 파라미터를 작성하면 SubCLS의 기본 생성자는 오류 발생
    SuperCLS(){
        count++;
    }
}
class SubCLS extends SuperCLS {
//    SubCLS(){
//        super();
//    } // 기본 생성자 작성x 기준
    // 조상 클래스의 기본 생성자가 없을 경우 조상클래스에 매개변수가 없는 생성자가 없다고 오류 생김
    void showCount () {
        System.out.println("count : " + count);
    }
}