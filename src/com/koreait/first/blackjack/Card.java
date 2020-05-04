package com.koreait.first.blackjack;

public class Card {
    private final String pattern; //무늬
    private final String denomination; //명칭 (A, 2~10, J, Q, K)가 들어감

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return String.format("pattern: %s, denomination: %s"
                , pattern, denomination);
    }
}
