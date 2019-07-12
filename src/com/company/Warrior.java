package com.company;

public class Warrior extends Player implements SuperPowerApplicable {
    @Override
    public void superPowerapply() {
        System.out.println("Warrior deals critical magical damage!");
    }
    public  void sayWord(){
        System.out.println("Let's Go!");
    }
}
