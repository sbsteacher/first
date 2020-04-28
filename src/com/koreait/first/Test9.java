package com.koreait.first;

public class Test9 {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        int[] arrInt2 = {1, 2, 3, 4, 5, 100};

        arrInt[0] = 10;
        arrInt[1] = 10;
        arrInt[2] = 10;
        arrInt[3] = 20;

        for(int i=0; i<arrInt.length; i++) {
            int val = arrInt[i];
            System.out.printf("%d - %d\n", i, val);
        }
        System.out.println("-------------------");
        int i=0;
        for(int val : arrInt) {
            System.out.printf("%d - %d\n", i++, val);
        }
    }
}
