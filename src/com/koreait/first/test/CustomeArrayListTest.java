package com.koreait.first.test;

public class CustomeArrayListTest {
    public static void main(String[] args) {

        int value = factorial(6); //5*4*3*2*1
        System.out.println(value);
    }

    public static int factorial(int v) {
        if(v > 1) {
            return v * factorial(v - 1);
        } else {
            return v;
        }

    }
}
