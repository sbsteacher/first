package com.koreait.first.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cardList = new ArrayList();

    public CardDeck() {
        super();
        init();
    }

    public void printCardList() {
        for(Card c : cardList) {
            System.out.println(c);
        }
    }

    private void init() {
        for(int i=0; i<Card.PATTERNS.length; i++) {
            for(int z=1; z<=13; z++) {
                String denomination = null;
                switch(z) {
                    case 1:
                        denomination = "A"; break;
                    case 11:
                        denomination = "J"; break;
                    case 12:
                        denomination = "Q"; break;
                    case 13:
                        denomination = "K"; break;
                    default:
                        denomination = String.valueOf(z);
                }

                Card card = new Card(Card.PATTERNS[i], denomination);
                cardList.add(card);
            }
        }
    }

    public Card draw() {
        int rIdx = (int)(Math.random() * cardList.size());
        Card temp = cardList.get(rIdx);
        cardList.remove(rIdx);
        return temp;
    }
}
