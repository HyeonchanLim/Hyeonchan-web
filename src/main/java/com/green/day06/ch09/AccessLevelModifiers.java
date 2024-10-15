package com.green.day06.ch09;

public class AccessLevelModifiers {
    /*
    접근 수준 지시자 : private , default(작성안함) , protected , public

    private : class 내에서만 접근 가능
    default : private + 같은 패키지면 접근 가능 , 클래스 이름앞에 x or 멤버필드 앞에 x , 자손이나 부모 클래스여도 불가능
    protected : default + 상속 관계면 접근 가능
    public : 무조건 접근 가능 , 완전 오픈

    class 는 보통 public 붙이고 멤버필드는 대부분 private 이다.
    상수(final)에는  private 을 붙이지 않아도 된다.
    변수는 무조건 private (은닉화 / 캡슐화)
    private 한 멤버필드를 읽기 / 쓰기할 때 메소드를 통해서한다. (getters / setters)
     */
}
