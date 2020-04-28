package com.koreait.first;

public class Test8 {
    public static void main(String[] args) {
        Calc cal_1 = new Calc();
        cal_1.num1 = 10;
        cal_1.num2 = 20;
        cal_1.name = "일반계산기";
        System.out.println("cal_1.sum() : " + cal_1.sum() + ", 이름 : " + cal_1.name);

        Calc cal_2 = new Calc();
        cal_2.num1 = 44;
        cal_2.num2 = 60;
        cal_2.name = "공학계산기";
        System.out.println("cal_2.sum() : " + cal_2.sum() + ", 이름 : " + cal_2.name);
        System.out.println("cal_1.sum() : " + cal_1.sum() + ", 이름 : " + cal_1.name);

        System.out.println("-----------------");
        cal_1 = cal_2;
        System.out.println("cal_2.sum() : " + cal_2.sum() + ", 이름 : " + cal_2.name);
        System.out.println("cal_1.sum() : " + cal_1.sum() + ", 이름 : " + cal_1.name);

        System.out.println("----------------- [ 스태틱 ] ------------------");
        //CalcStatic.name = "일반계산기";
        System.out.println("CalcStatic.sum(10, 20) : " + CalcStatic.sum(10, 20));
       // CalcStatic.sumPrint(10, 20);
    }
}

class Calc {
    static String name;
    int num1, num2;
    int sum() {
        return num1 + num2;
    }
    void sumPrint() {
        System.out.printf("%s의 결과값은 %d이다\n", name, (num1 + num2));
    }
}

class CalcStatic {
    String name;
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    void sumPrint(int num1, int num2) {
        System.out.printf("%s의 결과값은 %d이다\n", name, (num1 + num2));
    }
}