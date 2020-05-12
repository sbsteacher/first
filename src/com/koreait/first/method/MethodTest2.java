package com.koreait.first.method;

public class MethodTest2 {
    public static void main(String[] args) {
        Star star = new Star();
        //star.printStar(5);
        //star.printSqure(5);
        //star.printTriangle(5);
        star.printTriangleReverse(5);
    }
}

class Star {
    public void printTriangleReverse(int num) {
        for(int i=num; i>0; i--) {
            printStar(i);
        }
    }

    public void printTriangle(int num) {
        for(int i=1; i<=num; i++) {
            printStar(i);
        }
    }

    public void printSqure(final int num) {
        for(int i=0; i<num; i++) {
            printStar(num);
        }
    }

    public void printStar(int num) {
        for(int i=0; i<num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}