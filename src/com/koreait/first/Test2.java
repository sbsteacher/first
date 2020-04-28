package com.koreait.first;

public class Test2 {
    public static void main(String[] args) {
        String str1 = new String("자바");
        String str2 = str1;

        String str3 = new String("자바");


        //System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
