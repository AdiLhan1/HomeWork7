package com.company;

public class Mental extends Player implements SuperPowerApplicable {
    @Override
    public void superPowerapply() {
        System.out.println("Mental deals critical magical damage!");
    }
    public  void sayWord(){
        System.out.println("PIU PIU!");
    }
}