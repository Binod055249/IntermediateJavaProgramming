package com.example.intermediatejavaprogramming;

public class Bird extends Animal {

    private final boolean canFly;
    private int numberOfLegs;
    private int numberOfWings;

    public Bird(String name, String color,int amountOfSpeed,int amountOfPower,boolean canFly,int numberOfLegs,int numberOfWings){
        super(name,color,amountOfSpeed,amountOfPower);
        this.canFly=canFly;
        this.numberOfLegs=numberOfLegs;
        this.numberOfWings=numberOfWings;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%s: %b\n%s: %d\n%s: %d\n",
                "Fly",canFly,"Number Of Legs",numberOfLegs,"Number Of Wings",numberOfWings);
    }
}
