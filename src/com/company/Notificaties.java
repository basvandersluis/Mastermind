package com.company;

public class Notificaties {

    void spelStart() {
        System.out.println("\n" +
                        "\n" +
                        "====================" +
                        "\n" +
                        "Welkom bij Mastermind!\n" +
                        "====================" +
                        "\n" +
                        "\n" +
                        "Het spel waar je een code moet kraken!\n" +
                        "Je krijgt een code te zien die uit 4 letters bestaat.\n" +
                        "Deze code kan bestaan uit de letters a, b, c, d, e & f.\n" +
                        "De volgorde van de letters wordt random door de computer bepaald & letters kunnen meerdere keren voorkomen.\n" +
                        "Er zit GEEN limiet aan het aantal pogingen dat je kunt wagen om de code te kraken\n" +
                        "Je kunt het spel stoppen door op q te drukken!\n");
    }

    void raden() {
        System.out.println("Vul hier de 4 letterige code in:\n");
    }

    void gewonnen() {
        System.out.println("Je hebt de computer verslagen!\n");
    }

    void nietGewonnen() {
        System.out.println("Dit is niet de juiste code. Probeer het nog eens!\n");
    }

    void verkeerdeInput() {
        System.out.println("\nDeze input is ongeldig. Vul een 4 letterige code in, bestaande uit de letters a, b, c, d, e of f!\n" +
                           "Als je wilt stoppen, druk op q.\n");
    }

    void juistePositie(int x) {
        String letter = "letters";
        if (x == 1) {
            letter = "letter";
        }
        System.out.println("Je hebt " + x + " " + letter + " op de juiste positie!\n");
    }

    void charInCode (int x) {
        String letter = "letters";
        if (x == 1) {
            letter = "letter";
        }
        System.out.println("Je hebt " + x + " " + letter + " juist geraden!\n");
    }
}
