package com.pacificcar;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return this.getClass().getSimpleName() + "'s engine is starting";
    }
    @Override
    public String accelerate(){
        return this.getClass().getSimpleName() + "'s engine is accelerating";

    }
    @Override
    public String brake(){
        return this.getClass().getSimpleName() + "'s engine is braking";
    }
}
