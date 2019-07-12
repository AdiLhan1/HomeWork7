package com.company;

public class Boss extends Player implements SuperPowerApplicable{
    @Override
    public void superPowerapply() {
        System.out.println("The boss has protection, no super powers!");
    }
    public  void sayWord(){
        System.out.println("Bugagaga!!!");
    }
}