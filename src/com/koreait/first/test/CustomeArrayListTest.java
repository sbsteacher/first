package com.koreait.first.test;

public class CustomeArrayListTest {
    public static void main(String[] args) {
        CustomArrayList ca = new CustomArrayList(); //int형

        ca.add(22); //0
        ca.add(26); //1
        ca.add(11); //2
        ca.add(41); //3

        ca.remove(1);
        ca.printValues();
    }
}
