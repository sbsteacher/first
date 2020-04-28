package com.koreait.first.obj;

public class Ferrari extends SportsCar {
    public Ferrari() {
        super("페라리");
    }

    public void printFerrariName() {
        System.out.println(name);
    }

    @Override
    public void drive() {
        System.out.printf("%s는 겁나 빠르게 달린다.\n", name);
    }
}
