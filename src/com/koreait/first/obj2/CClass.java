package com.koreait.first.obj2;

public class CClass implements Testable {
    @Override
    public void printMyName() {
        System.out.println("나는 CClass입니다.");
    }

    @Override
    public int returnMyAge() {
        return 30;
    }
}
