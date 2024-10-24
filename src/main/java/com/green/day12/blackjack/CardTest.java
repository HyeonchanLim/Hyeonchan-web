package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        // ctrl 누르고 메소드 클릭하면 해당 메소드 위치로 이동
        CardDeck cd = new CardDeck();
        cd.checkCard();
        System.out.println("====");
        Card c = cd.draw();
        System.out.println(c);
        System.out.println("====");
        cd.checkCard();

    }
}
