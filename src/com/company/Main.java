package com.company;

public class Main {

    public static void main(String[] args) {
	// De computer 4 random letters laten kiezen uit {a, b, c, d, e, f} CHECK
    // Een speler creëren CHECK
    // De speler moet een code van 4 letters kunnen opgeven. (niet meer of minder) CHECK
    // De computer het aantal correcte letters die NIET op de juiste plaats staan laten controleren + melding
    // De computer het aantal correcte letters dat WEL op de juiste plaats staan laten controleren + melding
    // Een speler de mogelijkheid geven om een lopend spel te beëindigen met 'q' CHECK

    GameLoop gameLoop = new GameLoop();
    gameLoop.start();

    }
}
