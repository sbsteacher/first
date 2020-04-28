package com.koreait.first.obj;

public class CarTest2 {
    public static void main(String[] args) {
        Car car1 = new Car("");
        Car car2 = new SportsCar("");
        Car car3 = new Ferrari();

        //SportsCar sc0 = new Car("");
        SportsCar sc1 = new SportsCar("페라리");



        SportsCar sc2 = new Ferrari();

        SportsCar sc3 = (SportsCar)car2;
        SportsCar sc4 = (SportsCar)car1;
    }
}
