package com.koreait.first;

public class ArrayMission {
    public static void main(String[] args) {
        int[] arr = makeArrInt(10);
        inputValueOrder(arr);
        printArray(arr);
    }
    public static void printArray(int[] ddd) {
        for(int i=0; i<ddd.length; i++) {
            System.out.printf("%d - %d\n", i, ddd[i]);
        }
    }
    public static void inputValueOrder(int[] aaa) {
        for(int i=0; i<aaa.length; i++) {
            aaa[i] = i + 1;
        }
    }
    public static int[] makeArrInt(int size) {
        return new int[size];
    }
}
