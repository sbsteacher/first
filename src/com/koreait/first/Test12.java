package com.koreait.first;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[] arr = new int[20]; // 1~9
        inputValueOrder(arr);
        printArr(arr);
        shuffleArr(arr);
        printArr(arr);
    }

    public static void inputValueOrder(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void shuffleArr(int[] arr){
        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length); //50~60
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }
    }

    public static void inputRandomValueNoDuplicate(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int rVal = (int)(Math.random() * 9 + 1); //1~9
            for(int z=0; z<arr.length; z++) {
                if(arr[z] == 0) {
                    arr[z] = rVal;
                    break;
                } else if(arr[z] == rVal) {
                    i--;
                    break;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void inputRandomValue(int[] arr) { //1~9
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 9 + 1);
        }
    }



}
