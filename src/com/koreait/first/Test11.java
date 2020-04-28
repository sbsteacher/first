package com.koreait.first;

public class Test11 {
    public static void main(String[] args) {
        int[] arr = {49, 20, 77, 38, 22, 10, 4};

        for(int i=1; i<arr.length; i++) {
            for(int z=0; z<arr.length - i; z++) {
                if(arr[z] > arr[z+1]) {
                    int temp = arr[z];
                    arr[z] = arr[z+1];
                    arr[z+1] = temp;
                }
            }
        }

        for(int i=arr.length; i > 0; i--) {
            for(int z=0; z<i; z++) {

            }
        }

        for(int val : arr) {
            System.out.print(val + ",");
        }
    }
}
