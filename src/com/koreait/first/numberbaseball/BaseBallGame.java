package com.koreait.first.numberbaseball;

import java.util.Arrays;
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
        tryGame();
        System.out.println("게임 종료!!");
        scan.close();
    }
    private void tryGame() {
        do {
            System.out.printf("값 %d개를 입력해주세요. (1~9사이 값): ", myArr.length);
            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = scan.nextInt();
            }
        }while(isGameContinue());


    }

    private boolean isGameContinue() {
        int strike = 0;
        int ball = 0;
        for(int i=0; i<gameArr.length; i++) {
            for(int z=0; z<myArr.length; z++) {
                if(gameArr[i] == myArr[z]) {
                    if(i == z) {
                        strike++;
                    } else {
                        ball++;
                    }
                    break;
                }
            }
        }

        System.out.printf("S:%d, B:%d, O:%d\n"
                , strike, ball, (gameArr.length - (strike + ball)));

        return strike < gameArr.length;
    }

    /*
    public void gameStart() {
        setRandomValues();
        do {
            for(int i=1; i<=gameArr.length; i++) {
                System.out.printf("숫자%d입력 : ", i);
                myArr[i] = scan.nextInt();
            }
        }while(isContinueChecked());
    }

    private boolean isContinueChecked() {
        boolean result = true;

        for(int i=0; i<gameArr.length; i++) {
            for(int z=0; z<myArr.length; z++) {

            }
        }

        return result;
    }
*/

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
