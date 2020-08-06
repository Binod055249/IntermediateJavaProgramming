package com.example.intermediatejavaprogramming;

public class Cat extends Animal{

    private final int numberOfLegs;
    private boolean canHuntOtherAnimals;


    public Cat(String name, String color, int amountOfSpeed, int amountOfPower,
               int numberOfLegs,boolean canHuntOtherAnimals){
        super(name,color,amountOfSpeed,amountOfPower);

        this.numberOfLegs=numberOfLegs;
        this.canHuntOtherAnimals=canHuntOtherAnimals;
    }

    public boolean outputValues(){
        return canHuntOtherAnimals;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean getCanHuntOtherAnimals() {
        return canHuntOtherAnimals;
    }

    public void setCanHuntOtherAnimals(boolean canHuntOtherAnimals) {
        this.canHuntOtherAnimals = canHuntOtherAnimals;
    }

    @Override
    public String toString() {

        return super.toString()+String.format(
                        "%s: %d\n" +
                        "%s: %b\n"
                ,"NumberOfLegs",numberOfLegs,
                "Fight",canHuntOtherAnimals)+"Animal Value: "+evaluateAnimalValue()+"\n";
    }
}
