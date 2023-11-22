package com.randd;

public class ElectricCar extends CarSkeleton{
    double avgKMPerCharge;
    int batterySize;
    public ElectricCar(String name, String description, double avgKMPerCharge, int batterySize) {
        super(name, description);
        this.avgKMPerCharge = avgKMPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public String toString() {
        return super.toString() +  "ElectricCar{" +
                "avgKMPerCharge=" + avgKMPerCharge +
                ", batterySize=" + batterySize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
