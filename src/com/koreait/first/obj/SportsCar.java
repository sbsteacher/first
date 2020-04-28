package com.koreait.first.obj;

public class SportsCar extends Car {

    public SportsCar(String name) {
        super(name);
        System.out.println("스포츠카 생성자!");
    }

    public void printMyName() {
        System.out.println(name);
    }

    public void printParentName() {
        System.out.println(super.name);
    }

    @Override
    public void drive() {
        System.out.printf("%s is driving!!\n", name);
    }
}
