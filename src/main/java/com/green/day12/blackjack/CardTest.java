package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        CardDeck cardDeck = new CardDeck();
        Card c = cardDeck.draw();
        cd.checkCard();

    }
}
