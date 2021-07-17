package com.company;
import java.util.Scanner;

public class Speler {
    Notificaties meldingen = new Notificaties();

    boolean heeftGewonnen = false;

    public char[] raden() {
        meldingen.raden();

        Scanner usr = new Scanner(System.in);
        String userInput = usr.nextLine();

        userInput = userInput.toLowerCase();

        if (userInput.equals("q")) {
            System.exit(0);
        }

        return userInput.toCharArray();
    }
}
