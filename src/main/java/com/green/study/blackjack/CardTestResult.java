package com.green.study.blackjack;

public class CardTestResult {
    public static void main(String[] args) {
        CardDeckResult cd = new CardDeckResult();
        CardDeckResult cardDeck = new CardDeckResult();
        CardResult c = cardDeck.draw1();
        cd.checkCard();
    }
}
