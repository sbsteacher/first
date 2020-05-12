package com.koreait.first.method;

public class MethodTest1 {
    public static void main(String[] args) {
        //int dan = 5;
        //printGugudan(dan);
        int sDan = 2;
        int eDan = 9;
        //printGugudan(sDan, eDan); //시작단수가 종료단수보다 클 수 없습니다.

        //printGugudanOrder(sDan, eDan);

        //printGugudanOrder2_ver2(sDan, eDan);
    }

    public static void printGugudanOrder2_ver2(int sDan, int eDan) {
        int cnt = sDan > eDan ? sDan - eDan : eDan - sDan;
        int dan = sDan;
        for(int i=0; i<=cnt; i++) {
            printGugudan(dan);
            System.out.println();
            dan = sDan > eDan ? dan - 1 : dan + 1;
        }
    }

    public static void printGugudanOrder2_ver1(int sDan, int eDan) {
        if(sDan > eDan) {
            for(int i=sDan; i>=eDan; i--) {
                printGugudan(i);
                System.out.println();
            }
            return;
        }
        for(int i=sDan; i<=eDan; i++) {
            printGugudan(i);
            System.out.println();
        }
    }

    public static void printGugudanOrder(int sDan, int eDan) {
        if(sDan < eDan) {
            printGugudan(sDan, eDan);
            return;
        }
        for(int i=sDan; i>=eDan; i--) {
            printGugudan(i);
            System.out.println();
        }
    }

    public static void printGugudan(int sDan, int eDan) {
        if(sDan > eDan) {
            System.out.println("시작단수가 종료단수보다 클 수 없습니다.");
            return;
        }
        for(int z=sDan; z<=eDan; z++) {
            printGugudan(z);
            System.out.println();
        }
    }

    public static void printGugudan(int dan) {
        for(int i=1; i<=9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
        }
    }
}
