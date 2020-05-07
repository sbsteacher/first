package com.koreait.first.blackjack;

public class Dealer extends Gamer {
    private static final int CAN_RECEIVE_POINT = 16;

    public void moreCard(CardDeck cd) {
        if(getScore() <= CAN_RECEIVE_POINT) {
            receiveCard(cd.draw());
        }
    }
}
