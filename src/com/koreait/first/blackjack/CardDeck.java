package com.koreait.first.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List cardList = new ArrayList();

    public CardDeck() {
        super();
        init();
    }

    private void init() {
        Card c1 = new Card("스페이드", "3");
        cardList.add(c1);
    }
}
