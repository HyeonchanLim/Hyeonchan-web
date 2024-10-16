package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum=10;
        InstCnt ic1 = new InstCnt();
        InstCnt.instNum=5;
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}
class InstCnt{
    static int instNum;
    int value;

    InstCnt(){
        instNum++; // instnum 은 static이 있는 변수 , 한공간에서 가져온 데이터라 ++가 누적되어감
        // value++; // value는 호출할 때마다 0이라서 ++가 누적되지 않음
        System.out.println("인스턴스 생성 :" + instNum);
        System.out.println("value : " + value);
    }
}
