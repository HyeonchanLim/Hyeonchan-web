package com.green.day12.blackjack;

public class CardDeck {
    // card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards; // cards 는 final 선언으로 변경 불가능 , 52개 배열은 변수
    private final String[] patterns;
    private int selectedIdx = 0; // 외부에 줘야할 카드의 idx 값

    public CardDeck() { // 지역변수는 초기화값을 만들어주고 코드를 구성해야함.
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clover", "Spade"};
//        int type = (cards.length /patterns.length)-1;
//        for (int x=0; x<cards.length; x++){
//            for (int y=0; y<=type; y++){
//                cards[x] = new Card(patterns[x],getDenomination(y));
//            }
//        }
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = getDenomination(z);
                cards[idx++] = new Card(pattern, denomination);
            }
        }
        //random , shuffle
//        Card temp;
//        for (int i = 0; i < cards.length; i++) {
//            int shuffle = (int) (Math.random() * cards.length);
//            temp = cards[i];
//            cards[i] = cards[shuffle];
//            cards[shuffle] = temp;
//        }
        // "" , "" 값을 가지고 있는 card 객체를 52개를 만들고 cards 배열에 하나씩 넣어주세요.
//        for (int i=0; i<cards.length; i++){
//            cards[i]=new Card("A","B");
//        }
        shuffle();
        //enhanced-for문으로 card 객체 주소값 전부 출력
        for (Card c : cards) {
            System.out.println(c);
            // c는 Card 클래스의 toString을 출력하는데 Card 클래스에 toString이 없으면 object 클래스의 toString을 불러오기 때문에
            // 출력값이 com.green.~~~ 이렇게 나옴 그래서 Card클래스에 toString 메소드를 오버라이딩하여 만들어줘야한다.
        }
    }
    // cards 배열에 selectedIdx=0 번 부터 시작해서 방이 호출될때 마다 null을 주고 다음 방을 부르기 위해 ++ 를 사용
    public Card draw() {
        Card tmp = cards[selectedIdx]; //swapping 처럼 데이터를 잠시 보관함 장소를 생성
        cards[selectedIdx] = null;
        selectedIdx++;
        return tmp;
    }
    public void checkCard(){
        for(Card c : cards){
            System.out.println(c);
        }
    }
    private void shuffle(){
        for (int i=0; i< cards.length; i++){
            int rIdx = (int)(Math.random()*cards.length);
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx]=tmp;
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
