package com.green.study.blackjack;

public class CardResult {
    private final String pattern;
    private final String denomination;

    CardResult (String pattern , String denomination){
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }
}
