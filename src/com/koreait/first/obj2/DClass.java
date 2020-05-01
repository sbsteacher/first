package com.koreait.first.obj2;

public class DClass implements Testable {
    public int age;
    public String name;

    @Override
    public void printMyName() {
        System.out.println("내 이름은 " + name + "입니다.");
    }

    @Override
    public int returnMyAge() {
        return age;
    }
}
