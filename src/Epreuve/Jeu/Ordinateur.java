package Epreuve.Jeu;

import java.util.Random;

public class Ordinateur {
    private char[] code;

    public Ordinateur(char[] code) {
        this.code = code.clone();
    }

    public char[] getCode() {
        return code;
    }

    public void afficherCode() {
        for (char c : code) {
            System.out.print(c);
        }
        System.out.println();
    }
}

