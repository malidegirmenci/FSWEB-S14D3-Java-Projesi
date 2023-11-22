package com.randd;
public class randMain {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new CarSkeleton("Base Car", "This is a car skeleton");

        carSkeleton.startEngine();

        carSkeleton.drive();

        CarSkeleton electricCar = new ElectricCar("TOGG", "Made in Turkey",21,120);

        electricCar.startEngine();

        electricCar.drive();

        CarSkeleton gasPoweredCar = new GasPoweredCar("FORD", "Ford Falcon is very expensive car.",1.2,4);

        gasPoweredCar.startEngine();

        gasPoweredCar.drive();


        CarSkeleton hybridCar = new HybridCar("TOYATA YARIS ", "Fuel miser car",0.5,140,3);

        hybridCar.startEngine();

        hybridCar.drive();

    }
}
