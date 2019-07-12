package com.company;

public class Main {

    public static void main(String[] args) {
        Player [] players = {new Boss(), new Magical(), new Warrior(), new Mental()};

        for (int i=0; i<players.length;i++){
            players[i].sayWord();
        }
        SuperPowerApplicable[] superPowerApplicableHeroes = {new Boss(),new Magical(),new Warrior(),new Mental()};
        for (int i=0; i<superPowerApplicableHeroes.length;i++){
            superPowerApplicableHeroes[i].superPowerapply();
        }
    }
}
