package com.green.day10.ch14;

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("YOON", "Hybrid ELD" , "Staff Eng.");
        System.out.println(man1.getName());
        man1.tellYourSelf();
        //BusinessMan 클래스 안에는 tellYourSelf 메소드가 없지만 호출이 가능하다
        //man 클래스로부터 상속을 받았기 때문이다.
        System.out.println(man1.toString());
        man1.jump();
        man1.whatIsDoing();

        //man1.super.jump(); // 외부에서 this , super
    }
}
// 상속 키워드 생략하면 extends Object가 자동으로 붙는다.
// 모든클래스는 최상위 부모인 Object를 갖는다
class Man extends Object{
    private String name;
    public Man(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void tellYourSelf() {
        System.out.printf("제 이름은 %s입니다.\n" , name);
    }
    public void jump() {
        System.out.printf("%s가 점프!\n",name);
    }
}
class BusinessMan extends Man {
    private String company;
    private String position;

    public BusinessMan (String name, String company , String position){
        // super()는 내 조상의 기본 생성자를 호출함
        // man 클래스의 기본 생성자가 없어서 super(); 를 쓰면 ()에 빨간불 생김
        // super 소괄호를 생성자의 가장 위에 작성이 되어야 한다. (주의!!)
        // 해결 방법 2가지
        // 1. 부모에 기본 생성자를 만들어준다.
        // 2. man 클래스에 있는 생성자를 사용한다. 수동으로 작성
        super(name); // 내 부모의 상수
        this.company = company; // this는 나 자신
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }
    //오버라이딩 : 부모가 가진 메소드를 사용하는 것이 아니라 내가 재정의한 메소드를 사용하게끔 하는 기법
    public void jump() {
        super.jump(); // super를 없애면 this.이 나 자신(재귀 호출)을 계속 호출하기 때문에 무한루프에 빠진다
        System.out.printf("%s에 다니는 %s(이)가 점프!\n",company,getName());
        //name은 private이기 때문에 바로 접근할 수 없다.
        //public으로 상속받은 getName 메소드를 호출하여 이름값을 얻는다.
    }
    public void whatIsDoing(){
        super.jump(); // 부모가 가지고 있는 메소드를 호출하고 싶으면 super. 을 이용하면 된다.
    }
}