package com.example.intermediatejavaprogramming;

public class Leopard extends Cat {

    private String claws;

    public Leopard(String name, String color, int amountOfSpeed, int amountOfPower,
                   int numberOfLegs,boolean canHuntOtherAnimals,String claws){
        super(name, color,amountOfSpeed,amountOfPower,numberOfLegs,canHuntOtherAnimals);

        this.claws=claws;

    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%s: %s\n","Claws",claws);
    }
}
