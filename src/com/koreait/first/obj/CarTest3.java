package com.koreait.first.obj;

public class CarTest3 {
    public static void main(String[] args) {
        SportsCar sc1 = new SportsCar("페라리");
        sc1.printMyName();
        sc1.printParentName();
        System.out.println("-----------");

        Ferrari ferrari = new Ferrari();
        ferrari.printFerrariName();
    }
}
