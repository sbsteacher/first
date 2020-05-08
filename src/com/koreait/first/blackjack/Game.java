package com.koreait.first.blackjack;

import java.util.Scanner;

public class Game {
    private static final int FIRST_DRAW = 2;

    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<FIRST_DRAW; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }
        dealer.moreCard(cd);

        while(true) {
            gamer.openCards();
            System.out.print("카드를 더 받으시겠습니까?(Y/N) :");
            String answer = scan.next();

            if(!(answer.equals("Y") || answer.equals("y"))) {
                break;
            }
            gamer.receiveCard(cd.draw());
        }
        System.out.println("---딜러 카드---");
        dealer.openCards();
        Rule.whoIsWin(gamer, dealer);
    }
}
