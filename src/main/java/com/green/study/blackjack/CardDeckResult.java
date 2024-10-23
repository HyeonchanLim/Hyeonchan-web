package com.green.study.blackjack;

import com.green.day07.ch07.Car;
import com.green.day12.blackjack.Card;
import com.green.day12.blackjack.CardDeck;

public class CardDeckResult {
    private final CardResult[] cards;
    private final String[] patterns;
    int select = 0;
    public CardDeckResult() {
        cards = new CardResult[52];
        patterns = new String[]{"Diamond", "Heart", "Clover", "Spade"};

        int type = (cards.length / patterns.length) - 1; // 12
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < type; j++) {
                cards[i] = new CardResult(patterns[i],getDenomination1(j));
            }
        }
        for (cards c: cards){
            System.out.println(c);
        }
    }

    public String getDenomination1(int n) {
        if (n < 1 || n > 13) {
            return "";
        }
        switch (n) {
            case 1:
                return "A";
            case 10:
                return String.valueOf(n);
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return null; // return 없으면 문법 오류라고 생각해서 오류 생김 return을 넣어서 문법을 맞춰줌
        }
    }
            int temp= 0;
    private void shuffle(){
        for (int i=0; i< cards.length; i++){
            int shuffle = (int)(Math.random()* cards.length);
            CardResult temp = cards[i];
            cards[i] = cards[shuffle];
            cards[shuffle] = temp;
        }
    }

    public CardResult draw1 () {
        CardResult c = new cards[select];
        cards[select] = null;
        select++;
        return c;
    }
}
