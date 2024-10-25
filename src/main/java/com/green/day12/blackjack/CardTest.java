package com.green.day12.blackjack;

import com.green.day07.ch07.Car;

import java.util.List;

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

class CardTest2 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); // 카드를 저장한다.
        gamer.receiveCard(cd.draw()); // draw로 카드를 한장 더
        gamer.receiveCard(cd.draw());

        gamer.showYourCards(); // 현재 카드를 보여준다.
        System.out.println(gamer.getPoint()); // point값이 출력될 수 있도록

        List<Card> list = gamer.openCards(); // 게이머의 카드를 가져올 메서드 생성


    }
}
class CardTest3{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();

    }
}
class CardTest4 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();

        CardDeck cd1 = new CardDeck();
        Gamer gamer = new Gamer();
        gamer.receiveCard(cd1.draw());
        gamer.receiveCard(cd1.draw());
        gamer.receiveCard(cd1.draw());
        gamer.receiveCard(cd1.draw());
        gamer.showYourCards();

        Rule rule = new Rule();

        rule.getWinner(dealer,gamer);
    }
}