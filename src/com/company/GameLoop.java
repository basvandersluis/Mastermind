package com.company;

public class GameLoop {

    void start() {

        Hersenen hersenen = new Hersenen();

        Notificaties meldingen = new Notificaties();
        meldingen.spelStart();

        Computer computer = new Computer();

        Speler speler = new Speler();

        char[] computerCodeArray = computer.generateCode();

        while (!speler.heeftGewonnen) {
            char[] spelerCodeArray = speler.raden();

            if (!hersenen.isInputValid(spelerCodeArray)) {
                meldingen.verkeerdeInput();
                continue;
            }


            if (!hersenen.isInputValid(spelerCodeArray)) {
                meldingen.gewonnen();
                break;
            } else {
                meldingen.nietGewonnen();
            }

            hersenen.juisteLetters(computerCodeArray, spelerCodeArray);

            hersenen.juistePosities(computerCodeArray, spelerCodeArray);
        }
    }
}
