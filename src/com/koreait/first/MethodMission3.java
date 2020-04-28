package com.koreait.first;

import java.util.Scanner;

public class MethodMission3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 줄짜리 별 삼각형을 찍을건가요? ");
        String line = scan.next();

        int intLine = parseStringToInt(line, 0);
        if(intLine <= 0) {
            System.out.println("별을 찍을 수 없습니다.");
            return;
        }
        printTriStar(intLine);
    }

    public static void printTriStar(int line) {
        for(int i=0; i<line; i++) {
            for(int z=0; z<=i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int parseStringToInt(String str, int def) {
        int result = def;
        try {
            result = Integer.parseInt(str);
        } catch(Exception e) {}
        return result;
    }
}
