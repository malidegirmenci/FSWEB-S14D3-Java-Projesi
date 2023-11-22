package com.randd;

public class GasPoweredCar extends CarSkeleton{
    double avgKMPerLiter;
    int cylinders;
    public GasPoweredCar(String name, String description, double avgKMPerLiter, int cylinders) {
        super(name, description);
        this.avgKMPerLiter = avgKMPerLiter;
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
        return super.toString() +  "GasPoweredCar{" +
                "avgKMPerLiter=" + avgKMPerLiter +
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
