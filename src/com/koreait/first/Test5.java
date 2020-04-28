package com.koreait.first;

public class Test5 {
    public static void main(String[] args) {
        int num = 87;

        if(num > 100 || num < 0) {
            System.out.println("잘 못 입력!");
        } else if(num >= 90) {
            System.out.println("A학점");
        } else if(num >= 80) {
            System.out.println("B학점");
        } else if(num >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");
        }
    }
}
