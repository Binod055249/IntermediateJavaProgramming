package com.example.intermediatejavaprogramming;

public class VehicleI2 {

    private int speed;
    private final boolean hasBreaking;
    private int numberOfWheels;

    private int rideSpeed;

    public VehicleI2(int speed, boolean hasBreaking,int numberOfWheels){
        this.speed=speed;
        this.hasBreaking=hasBreaking;
        this.numberOfWheels=numberOfWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isHasBreaking() {
        return hasBreaking;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getRideSpeed() {
        return rideSpeed;
    }

    public void ride(){
        int result=getSpeed()*getNumberOfWheels();
         rideSpeed=result;
    }

    @Override
    public String toString() {
        return String.format("%s: %d %s: %b %s: %d %s: %d","Speed",getSpeed(),"BreakingSystem"
                ,isHasBreaking(),"No. Of Wheels",getNumberOfWheels(),"Ride Speed",getRideSpeed());
    }
}
