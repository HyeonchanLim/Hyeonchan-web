package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        //static 사용 방법
        AccesWay aw = new AccesWay(); // 0 > 1
        aw.increaseCnt(); // 1 > 2
        aw.num++; // 2 > 3
        AccesWay.num++; // 3 > 4 전부 같은 내용들임
        System.out.printf("num : %d\n" , AccesWay.num); // 클래스명.static 변수 or 메소드 로 작성
        System.out.printf("num : %d\n" , aw.num); // 가능은 하지만 static때문에 객체화를 하지 않기 때문에 쓸일이 x

    }
}

class AccesWay {
    static int num = 0;

    AccesWay(){
        increaseCnt();
    }
    void increaseCnt () { // num은 non-static이지만 static을 사용 가능 but 반대로는 불가능
        num++;
    }
}
