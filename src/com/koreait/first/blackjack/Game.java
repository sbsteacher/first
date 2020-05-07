package com.koreait.first.blackjack;

public class Game {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());

        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());

        dealer.moreCard(cd);

        Rule.whoIsWin(gamer, dealer);
    }
}
