package com.koreait.first;

public class Test10 {
    public static void main(String[] args) {
        int[] arr = {49, 20, 77, 38, 22, 10, 4};

        for(int i=0; i<arr.length - 1; i++) {
            for(int z=i+1; z<arr.length; z++) {
                if(arr[i] > arr[z]) {
                    int temp = arr[z];
                    arr[z] = arr[i];
                    arr[i] = temp;
                }
            }
        }



    }
}
