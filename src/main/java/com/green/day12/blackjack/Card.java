package com.green.day12.blackjack;

public class Card {
    private final String pattern; //무늬
    private final String denomination; //A, 2~10, J, Q, K 값 저장

    public Card(final String pattern, final String denomination) {// 상수의 데이터를 매개변수에 가져오면서 변경이 없도록 만들고 final을 붙이면 속도가 빨라짐.
        // 그리고 불변성을 나타내는 final이라 이 파라미터의 변경을 못하게 하는 개발자의 의도를 보이게 해줌.
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    /*
    toString 을 메소드 하는 이유는 기본적으로 toString은 최고 부모인 Object 클래스의 toString메소드를 가져오는데 여기서 toString은 해시코드를 출력하는 타입이다.
    그래서 해시코드가 아닌 출력값을 보고 싶으면 toString 메소드를 오버라이딩해서 직관적으로 볼 수 있게 해줌.
     */
    @Override
    public String toString() {
        return String.format("%s(%s)"
                , pattern, denomination);
    }
}
