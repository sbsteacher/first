package com.koreait.first.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private List<Card> cardList = new ArrayList();

    public void receiveCard(Card c) {
        cardList.add(c);
    }

    public void openCards() {
        /*
        for(int i=0; i<cardList.size(); i++) {
            Card card = cardList.get(i);
            System.out.println(card);
        }
         */

        for(Card card : cardList) {
            System.out.println(card);
        }
    }

    public int getScore() {
        int sum = 0;
        for(Card card : cardList) {
            sum += convertNumber(card);
        }
        return sum;
    }

    private int convertNumber(Card c) {
        switch(c.getDenomination()) {
            case "A":
                return 1;
            case "J": case "Q": case "K":
                return 10;
            default:
                return Integer.parseInt(c.getDenomination());
        }
    }
}
