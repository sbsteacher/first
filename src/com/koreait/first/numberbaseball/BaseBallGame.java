package com.koreait.first.numberbaseball;

import java.util.Scanner;

public class BaseBallGame {
    private Scanner scan = new Scanner(System.in);
    private int[] gameArr;
    private int[] myArr;

    public BaseBallGame(int gameNo) {
       gameArr = new int[gameNo];
       myArr = new int[gameNo];
    }

    public void gameStart() {
        setRandomValues();

    }
    
    private void setRandomValues() {
        for(int i=0; i<gameArr.length; i++) {
            int rVal = (int)(Math.random() * 9 + 1);

            for(int z=0; z<gameArr.length; z++) {
                if(gameArr[z] == 0) {
                    gameArr[z] = rVal;
                    break;
                } else if(gameArr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }
}
