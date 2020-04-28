package com.koreait.first.obj;

public class Car {
    protected String name; //이름
    protected int cc; //배기량

    public Car(String name) {
        super();
        System.out.println("Car 생성자!");
        this.name = name;
    }

    public void drive() {
        System.out.printf("%s는 달린다\n", name);
    }

    public void stop() {
        System.out.printf("%s는 멈춘다\n", name);
    }
}
