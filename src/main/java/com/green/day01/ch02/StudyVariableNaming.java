package com.green.day01.ch02;

public class StudyVariableNaming {
    public static void main(String[] args) {
        /*
        변수 명명규칙
        1. 대소문자 구분 , 길이 제한 없음
        */
        int abc, abC; // 둘은 다른 변수

        // 2. 예약어를 사용하면 안 된다. 파란색 문자들
        // 예약어 - 이미 기능의 약속이 되어 있는 단어(에디터에서 파란색으로 표시) -  ex) int class, void;

        // 3. 숫자로 시작불가 ex) int 1abc -> X , int abc1 -> O

        // 4. 특수기호는 $ , _ 두개만 가능
        int $abc , _abc;

        // 5. camel case 기법을 사용 , hello, my , name , is  , hong - 첫글자 소문자는 camel , 대문자는 pascal case 기법 - 클래스명
        int helloMyNameIsHong;
    }
}
