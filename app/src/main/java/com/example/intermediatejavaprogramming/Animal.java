package com.example.intermediatejavaprogramming;

public class Animal{

    private final String name;
    private final String color;
    private int amountOfSpeed;
    private int amountOfPower;

    public Animal(String name, String color,int amountOfSpeed, int amountOfPower){

        this.name=name;
        this.color=color;
        this.amountOfSpeed=amountOfSpeed;
        this.amountOfPower=amountOfPower;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAmountOfSpeed() {
        return amountOfSpeed;
    }

    public void setAmountOfSpeed(int amountOfSpeed) {
        this.amountOfSpeed = amountOfSpeed;
    }

    public int getAmountOfPower() {
        return amountOfPower;
    }

    public void setAmountOfPower(int amountOfPower) {
        this.amountOfPower = amountOfPower;
    }

    public int evaluateAnimalValue(){

        int result=amountOfPower*amountOfSpeed;
        return result;
    }
    @Override
    public String toString() {

        return String.format("%s: %s\n %s: %s\n %s: %d\n %s: %d\n"," Name",name,"Color",color,
                "AmountOfSpeed",amountOfSpeed,"AmountOfPower",amountOfPower);
    }
}
