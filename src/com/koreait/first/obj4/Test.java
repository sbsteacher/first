package com.koreait.first.obj4;

public class Test {
    public static void main(String[] args) {
        Calcable calImple_1 = new Calcable() {
          @Override
          public int calc(int n1, int n2) {
              return n1 * n2;
          }
        };

        Calc obj1 = new Calc();
        System.out.println("---- 1 ----");
        obj1.calcSum(calImple_1);

        System.out.println("---- 2 ----");
        obj1.calcSum(new Calcable() {
            @Override
            public int calc(int n1, int n2) {
                return n1 + n2;
            }
        });
    }
}

class Calc {
    int a = 10, b = 2;

    public void calcSum(Calcable c) {
        int result = c.calc(a, b);
        System.out.println("result : " + result);
    }
}

interface Calcable {
    int calc(int n1, int n2);
}
