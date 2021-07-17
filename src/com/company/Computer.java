package com.company;
import java.util.Random;

public class Computer {
    public char[] generateCode() {
        final String s = "abcdef";
        Random rand = new Random();

        String computerCodeGenerate = "";

        StringBuilder sb = new StringBuilder();
        while (computerCodeGenerate.length() < 4) {
            sb.append(s.charAt(rand.nextInt(s.length())));
            computerCodeGenerate = sb.toString();
        }

        return computerCodeGenerate.toCharArray();
    }
}
