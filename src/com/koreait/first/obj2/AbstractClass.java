package com.koreait.first.obj2;

public abstract class AbstractClass {
    private int age;
    private String name;

    public void printMyName() {
        System.out.println(name + "입니다.");
    }

    abstract public int returnMyAge();
}
