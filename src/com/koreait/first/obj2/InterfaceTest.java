package com.koreait.first.obj2;

public class InterfaceTest {
    public static void main(String[] args) {
        printMyName(new CClass());

        DClass d = new DClass();
        d.age = 12;
        d.name = "홍길동";
        printMyName(d);
    }

    public static void printMyName(Testable t) {
        t.printMyName();
    }
}
