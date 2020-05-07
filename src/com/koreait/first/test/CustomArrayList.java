package com.koreait.first.test;

public class CustomArrayList {
    private int[] arr = new int[0];

    public void add(int val) {
        int[] temp = new int[arr.length + 1];
        for(int i=0; i<arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[arr.length] = val;
        arr = temp;
    }

    public void add(int idx, int val) {
        int[] temp = new int[arr.length + 1];

        for(int i=0; i<arr.length; i++) {
            if(i < idx) {
                temp[i] = arr[i];
            } else {
                temp[i+1] = arr[i];
            }
        }
        temp[idx] = val;
        arr = temp;
    }

    public void remove() {
        int[] temp = new int[arr.length - 1];

        for(int i=0; i<temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public void remove(int idx) {
        int[] temp = new int[arr.length - 1];
        for(int i=0; i<temp.length; i++) {
            if(i<idx) {
                temp[i] = arr[i];
            } else {
                temp[i] = arr[i+1];
            }
        }
        arr = temp;
    }

    public int size() {
        return arr.length;
    }

    public int get(int idx) {
        return arr[idx];
    }

    public void printValues() {
        for(int val : arr) {
            System.out.println(val);
        }
    }
}
