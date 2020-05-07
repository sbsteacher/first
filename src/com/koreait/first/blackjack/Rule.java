package com.koreait.first.blackjack;

public class Rule {
    public static int WIN_SCORE = 21;
    public static void whoIsWin(Gamer gamer, Dealer dealer) {
        int gamerScore = gamer.getScore();
        int dealerScore = dealer.getScore();

        if(gamerScore == dealerScore || (gamerScore > WIN_SCORE && dealerScore > WIN_SCORE)) {
            System.out.println("비김!");
        } else if(dealerScore > WIN_SCORE || (gamerScore < WIN_SCORE && gamerScore > dealerScore)) {
            System.out.println("게이머 Win!");
        } else {
            System.out.println("딜러 Win!");
        }
    }

}
