package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    // card 객체 주소값 여러개 저장할 수 있어야 합니다.
    // ArrayList 사용
    // 멤버필드 선언. 변수명은 cards

    protected final List<Card> cards;
    protected int point;


    public Gamer(){
        cards = new ArrayList();
    }
    public void receiveCard(Card c1){
        //switch expression / 람다식이 아닌 스위치 표현식
        this.point += switch (c1.getDenomination()){ // this는 생략가능
            case "A" -> 1;
//            case "A" -> (){yield 1;} 같은 방법이지만 앞에 () 타입 적어줘야하면 이렇게
            case "J","Q","K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
        };
    String str = "10";
    int val = Integer.parseInt(str); // val 변수에 10 정수값이 입력 , 문자열을 정수로 변환시켜줌
    cards.add(c1);

    }

    public void showYourCards(){
        for (Card item : cards){
            System.out.println(item);
        }
//        for (int i=0; i<cards.size(); i++){
//        System.out.print(cards.get(i));
//        }
    }
    public List<Card> openCards() {
        return cards;
    }
    public int getPoint(){
        return point;
    }
}
