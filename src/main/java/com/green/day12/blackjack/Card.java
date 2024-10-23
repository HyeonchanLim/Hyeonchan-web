package com.green.day12.blackjack;

public class Card {

    private final String pattern; // 무늬
    private final String denomination; // A , 2~10 , J , Q , K 값 저장 점수를 바꿔야해서 valueOf로 전환

    Card (final String pattern , final String denomination){
        // final을 선언한 원본을 유지 , final의 속도 때문에 fianl 선언
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
    }
}
