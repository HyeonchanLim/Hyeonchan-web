package com.green.day14.ch17;

public abstract class AbstractStudy {
    /*
    p.380 추상클래스
1
    class 키워드 앞에 abstract 키워드를 붙이면 추상클래스가 된다.
    추상클래스가 되면 객체화 불가능 -> 부모역할만 한다. (단독으로는 의미 없음)
    추상클래스를 상속받는 클래스가 있기 마련이다.

    class 앞에 abstract 를 붙이는 것은 선택사항이나 만약에 추상 메소드를
    가지게 된다면 선택사항이 아니라 필수사항이 된다.

    클래스간의 공통적인 부분을 부모에 작성을 해서 상속받도록 하기 위함
    그리고 추상 메소드를 구현해야하는 강제성 이 존재한다.
    추상 메소드 구현 : implements , 구현한다라고 표현한다.(구현부를 만드는 행위)

     */
    //추상 메소드 정의 (선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다.
    // 그리고 abstract 키워드를 붙여야 한다.
    public abstract void sum();

    //추상클래스도 구현부가 있는 메소드를 가질 수 있다.
    public void multiply(int n1 , int n2){
        System.out.println(n1 * n2);
    }
}

abstract class implementsStudy2 extends AbstractStudy{
    // 추상클래스를 상속받으면 추상메소드를 오버라이딩 해서 구현해줘야 하지만
    // 추상클래스에 추상클래스를 상속받으면 구현 안해줘도 괜찮음

}

class implementsStudy extends AbstractStudy {

    //무조건 부모의 추상 메소드를 구현해야 한다.
    @Override
    public void sum(){
        System.out.println("숫자를 더했다.");
    }
}

class AbstractStudyTest {
    public static void main(String[] args) {
        // AbstractStudy as = new AbstractStudy();  // 추상클래스라서 객체화 불가능
        AbstractStudy as2 = new implementsStudy();
        as2.sum(); // AbstractStudy 는 sum 메소드를 알 고 있어서 호출 가능하다.
        //그리고 가장 먼저 만나는 implementsStudy 의 sum 을 가지고 온다

    }
}
