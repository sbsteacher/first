package com.koreait.first.exception;

public class ExceptionTest2 {
    public static void main(String[] args) throws Exception {
        Calc cal = new Calc();
        try {
            float result = cal.div(10, 0);
            System.out.println("result : " + result);
        }catch(Exception e) {

        }
    }
}

class Calc {
    public float div(int n1, int n2) throws Exception {
        return n1 / n2;
    }
}
