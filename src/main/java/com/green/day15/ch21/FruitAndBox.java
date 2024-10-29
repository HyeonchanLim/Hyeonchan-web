package com.green.day15.ch21;

//p.480
//Generic 이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args) {
        Apple apple = new Apple();
        AppleBox ab = new AppleBox(apple);

        OrangeBox ob = new OrangeBox(new Orange());
    }
}

class Apple {
    public String toString (){ // String 클래스의 toString 메소드 오버라이딩
        return "사과";
    }
}

class Orange {
    public String toString (){ // String 클래스의 toString 메소드 오버라이딩
        return "오렌지";
    }
}

class AppleBox {
    private Apple ap;
    AppleBox (Apple ap) {
        super();
        this.ap = ap;
    }
    //메소드를 통해 ap값을 외부로 리턴할 수 있어야 한다.
    Apple getAp (){
        return ap;
    }
}
class OrangeBox {
    private Orange orange;
    OrangeBox(Orange orange){
        super();
        this.orange=orange;
    }
    Orange getOrange() {
        return orange;
    }
}
