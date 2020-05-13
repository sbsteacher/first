package com.koreait.first.method;

import java.util.Arrays;

public class MethodTest3 {
    public static void main(String[] args) {
        //int val = Math.abs(-5);
        int val = MyMath.abs(0);
        System.out.println("val : " + val);

        int[] arr = {12, 50, 3, 11, 99, 100, 200, 12};

        int min = MyMath.getMin(arr); //1
        int max = MyMath.getMax(arr); //200
        System.out.println("min: " + min);
        System.out.println("max: " + max);

        float div = MyMath.divMaxMin(arr); // max / min 값 결과값을 리턴하는 메소드
        System.out.println("div: " + div);

        System.out.println(Arrays.toString(arr));
        MyMath.sort(arr);
        System.out.println(MyMath.toString(arr));
    }
}

class MyMath {
    public static String toString(int[] array) {
        String result = "";
        for(int i=0; i<array.length; i++) {
            if(i > 0) {
                result += ", ";
            }
            result += array[i];
        }
        return "{" + result + "}";
    }

    public static void sort(int[] array) {
        for(int i=0; i<array.length - 1; i++) {
            for(int z=i+1; z<array.length; z++) {
                if(array[i] > array[z]) {
                    int temp = array[i];
                    array[i] = array[z];
                    array[z] = temp;
                }
            }
        }
    }

    public static float divMaxMin(int[] array) {
        int max = getMax(array);
        int min = getMin(array);
        float result = (float)max / min;
        return result;
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int abs(int num) {
        return num < 0 ? -num : num;
    }
}