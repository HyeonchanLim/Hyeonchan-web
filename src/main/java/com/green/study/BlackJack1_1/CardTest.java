package com.green.study.BlackJack1_1;

class CardTest {
        public static void main(String[] args) {
            CardDeck cd = new CardDeck();

            Card c = cd.draw();
            Card c2 = cd.draw();
            cd.checkCard();
        }
}
