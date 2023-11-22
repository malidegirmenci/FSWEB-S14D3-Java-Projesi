package com.randd;

public class HybridCar extends CarSkeleton{
    double avgKMPerLiter;
    int batterySize;
    int cylinders;
    public HybridCar(String name, String description, double avgKMPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKMPerLiter = avgKMPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
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
                "avgKMPerLiter=" + avgKMPerLiter +
                ", batterySize=" + batterySize +
                ", cylinders=" + cylinders +
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
