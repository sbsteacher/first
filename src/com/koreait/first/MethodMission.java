package com.koreait.first;

public class MethodMission {
    public static void main(String[] args) {
        printStar(5);

        String result = printStarString(6);
        //String result = "***\n***\n***\n";
        System.out.println(result);
    }

    public static String printStarString(int num) {
        String result = "";
        for(int z=0; z<num; z++) {
            for (int i = 0; i < num; i++) {
                result += "*";
                //result = result + "*";
            }
            result += "\n";
            //result = result + "\n";
        }
        return result;
    }

    public static void printStar(int num){
        for(int z=0; z<num; z++) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return;
    }
}
