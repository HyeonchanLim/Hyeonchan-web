package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    // card 객체 주소값 여러개 저장할 수 있어야 합니다.
    // ArrayList 사용
    // 멤버필드 선언. 변수명은 cards

    private final List<Card> cards;
    private int point;


    public Gamer(){
        cards = new ArrayList();
    }
    public void receiveCard(Card c1){
        //switch expression / 람다식이 아닌 스위치 표현식
        point += switch (c1.getDenomination()){
            case "A" -> 1;
            case "J","Q","K" -> 10;
            default -> Integer.parseInt(c1.getDenomination());
        };
    String str = "10";
    int val = Integer.parseInt(str); // val 변수에 10 정수값이 입력
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
}
