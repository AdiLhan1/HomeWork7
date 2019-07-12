package com.company;

public class Magical extends Player implements SuperPowerApplicable {
    @Override
    public void superPowerapply() {
        System.out.println("Magic deals critical magical damage!");
    }
    public  void sayWord(){
        System.out.println("Focus pokus");
    }
}