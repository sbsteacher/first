package com.koreait.first.obj;

public class CarTest4 {

    public static void callDrive(Car car) {
        car.drive();
    }

    public static void main(String[] args) {
        Car car1 = new SportsCar("쏘나타");
        car1.drive();

        SportsCar sc = (SportsCar)car1;
        sc.printMyName();

        Ferrari ferrari = new Ferrari();

        Car car2 = new Car("티코");
        Bus bus = new Bus("802번");

        callDrive(ferrari);
        callDrive(sc);
        callDrive(car2);
        callDrive(bus);
    }


}
