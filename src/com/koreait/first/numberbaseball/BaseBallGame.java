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
                myArr[i] = stringToInt(scan.next()); //"4" > 4, "2c11" > 0

                if(myArr[i] == 0) {
                    System.out.println("다시 입력해 주세요");
                    i--;
                }
            }
            System.out.println(Arrays.toString(myArr));
        }while(isGameContinue());
    }

    private int stringToInt(String val) {
        int result = 0;
        try {
            result = Integer.parseInt(val);
        } catch(Exception e) {}
        return result;
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
