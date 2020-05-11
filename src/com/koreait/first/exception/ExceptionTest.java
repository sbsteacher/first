package com.koreait.first.exception;

import com.koreait.first.numberbaseball.BaseBallGame;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = 1;
        try {
            System.out.println(10 / 10);
            System.out.println(10 / 10);
           // System.out.println(10 / 0);
            System.out.println(10 / 10);

            if(i == 1) { return; }
            System.out.println(10 / 10);
            //Class.forName("");
        } catch(ArithmeticException e) {
            System.out.println("숫자적 예외 발생!");
        } catch(Exception e) {
            System.out.println("예외 발생!");
            e.printStackTrace();
        } finally {
            System.out.println("Finally!!!!!!!!!!");
        }
        System.out.println("프로그램 종료!!");
    }
}
