package com.koreait.first.obj2;

public class OverrideTest {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = new String("안녕");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equals("안녕"));
        System.out.println("안녕".equals(str1));

    }
}
