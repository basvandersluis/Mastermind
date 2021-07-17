package com.company;
import java.util.Arrays;

public class Hersenen {
    Notificaties meldingen = new Notificaties();

    public boolean isInputValid (char[] y) {
        final String s = "abcdef";

        if (y.length != 4) {
            return false;
        }
        for (char c : y) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        for (char c : y) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean playerGewonnen(char[] x, char[] y) {
        return Arrays.equals(x, y);
    }

    public int juisteLetters(char[] x, char[] y) {
        int charInCode = 0;
        for (char c : x) {
            if (Arrays.toString(y).indexOf(c) != -1) {
                ++charInCode;
            }
        }
        meldingen.charInCode(charInCode);
        return charInCode;
    }

    public int juistePosities(char[] x, char[] y) {
        int juistePositie = 0;
        for (int i = 0; i < y.length; i++) {
            if (y[i] == x[i]) {
                ++juistePositie;
            }
        }
        meldingen.juistePositie(juistePositie);
        return juistePositie;
    }
}
