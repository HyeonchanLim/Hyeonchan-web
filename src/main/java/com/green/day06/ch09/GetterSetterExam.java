package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.setName("홍길동");
    // s1.name="홍길동";   this.name=name; 의 시점과 같음

    Student s2 = new Student();
    s2.setName("신사임당");

    Student a1 = new Student();
    s1.setAge(15);

    Student a2 = new Student();
    s2.setAge(20);
    }
}

class Student {
    private String name;
    private int age;
    private float height;

    //this 는 상수이고 나 자신의 주소값이 저장된 공간
    // main 메소드에서 같은걸 여러번 참조할 경우에는 참조되는 그 시점의 주소값을 가져옴
    public  void setName (String name){ // 첫글자 대문자로
        this.name = name;
    }
    /*
    getter 는 읽기 , 가져올때
    setter 는 변경할 때
     */

    public String getName() {
        return name;
    }

    public  void setAge (int age){
        this.age = age;
    }

    public int getAge () {
        return  age;
    }

}