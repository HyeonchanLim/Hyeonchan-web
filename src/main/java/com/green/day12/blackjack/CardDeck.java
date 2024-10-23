package com.green.day12.blackjack;

public class CardDeck {
    // card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards; // cards 는 final 선언으로 변경 불가능 , 52개 배열은 변수
    private final String[] patterns;


    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{ "Diamong" , "Heart" , "Clover" , "Spade"};

    // "" , "" 값을 가지고 있는 card 객체를 52개를 만들고 cards 배열에 하나씩 넣어주세요.
        for (int i=0; i<cards.length; i++){
            cards[i]=new Card("A","B");
        }

        System.out.println();
    //enhanced-for문으로 card 객체 주소값 전부 출력
        for (Card c : cards){
            System.out.println(c);
            // c는 Card 클래스의 toString을 출력하는데 Card 클래스에 toString이 없으면 object 클래스의 toString을 불러오기 때문에
            // 출력값이 com.green.~~~ 이렇게 나옴 그래서 Card클래스에 toString 메소드를 오버라이딩하여 만들어줘야한다.
        }

    }
    public String getDenomination (int n){

        if (n<1 || n>13){
            return "";
        }
        switch (n){
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(n);

        }
    }
}
