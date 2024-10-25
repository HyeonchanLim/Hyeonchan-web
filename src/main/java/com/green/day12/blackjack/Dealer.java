package com.green.day12.blackjack;

public class Dealer extends Gamer{
    //단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다.
    public void needsMoreCard(CardDeck cd){
        //본인이 16점 이하면 카드 한장 더 받는다.
        if (point <= 16){
            Card c = cd.draw();
            receiveCard(c);
        }

    }
}
