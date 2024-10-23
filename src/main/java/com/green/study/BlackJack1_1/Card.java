package com.green.study.BlackJack1_1;

public class Card {
    private final String pattern;
    private final String denomination;

    Card (String pattern , String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public String getPattern() {
        return pattern;
    }
    @Override
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
    }
}
