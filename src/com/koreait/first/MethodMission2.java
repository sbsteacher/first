package com.koreait.first;

import java.util.Scanner;

public class MethodMission2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("월을 입력해 주세요 : ");
        int season = scan.nextInt();

        String strSeason = getStrSeason(season);
        //String strSeason = "여름";
        System.out.printf("%d월은 %s입니다.\n", season, strSeason);
    }

    public static String getStrSeason(int se) {
        switch(se) {
            case 3: case 4: case 5:
                return "봄";
            case 6: case 7: case 8:
                return "여름";
            case 9: case 10: case 11:
                return "가을";
            case 12: case 1: case 2:
                return "겨울";
            default:
                return "이상한 값";
        }
    }
}
