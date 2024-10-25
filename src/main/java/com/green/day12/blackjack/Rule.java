package com.green.day12.blackjack;

public class Rule {
        private final int max = 21;
    public void getWinner(Dealer dealer , Gamer gamer){
        //1. 각 게이머(게이머 , 딜러) 의 점수를 얻을 수 있어야한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.
        // 비겼는 경우 : 둘의 값이 같은 경우 , 둘다 21을 넘어선 경우

//        int dealerPoint = 21;
//        int gamerPoint = 18;
//
//        System.out.println("Game Start");
//        if ( (dealerPoint>max&&gamerPoint>max) || (dealerPoint==gamerPoint) ) {
//            System.out.println("비겼습니다");
//        } else if ( (dealerPoint<max && gamerPoint<max) && dealerPoint>gamerPoint){
//            System.out.println("게이머가 이겼습니다");
//        } else {
//            System.out.println("딜러가 이겼습니다.");
//        }
//        System.out.println("New Game");


        int a = gamer.getPoint();
        int b = dealer.getPoint();

        System.out.println("Game Start");
        if ( (a>max&&b>max) || (a==b) ) {
            System.out.println("비겼습니다");
        } else if ( (a<max && b<max) && a>b){
            System.out.println("게이머가 이겼습니다");
        } else {
            System.out.println("딜러가 이겼습니다.");
        }
        System.out.println("New Game");

    }
}
