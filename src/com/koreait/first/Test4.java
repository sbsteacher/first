package com.koreait.first;

public class Test4 {
    public static void main(String[] args) {
       int n1 = 30;
       int n2 = 20;
       sum(n1, n2);

       int result = multi(3, 4);
       System.out.println("result : " + result);
    }
    static int multi(int n1, int n2) {
        return n1 * n2;
    }

    static void sum(int n1, int n2) {
        System.out.println("n1 : " + n1);
        System.out.println("n2 : " + n2);
        System.out.println("n1 + n2 : " + (n1 + n2));
    }
}
