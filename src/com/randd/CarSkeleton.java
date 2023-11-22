package com.randd;

import java.util.Objects;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void startEngine(){
        System.out.println(this.getClass().getSimpleName()+" started working");
    }

    public void drive(){
        runEngine();
        System.out.println(this.getClass().getSimpleName()+"'s driving");
    }

    protected void runEngine(){
        System.out.println(this.getClass().getSimpleName()+"s engine started");
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarSkeleton that = (CarSkeleton) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
