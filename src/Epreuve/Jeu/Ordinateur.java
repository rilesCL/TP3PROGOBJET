package Epreuve.Jeu;

import java.util.Random;

public class Ordinateur {
    private char[] code;
    /**
     * Construit un ordinateur avec un code secret initialisé.
     *
     * @param code Le code secret de l'ordinateur pour le jeu de Mastermind.
     */
    public Ordinateur(char[] code) {
        this.code = code.clone();
    }
    /**
     * Obtient le code secret de l'ordinateur.
     *
     * @return Le code secret.
     */
    public char[] getCode() {
        return code;
    }
    /**
     * Affiche le code secret de l'ordinateur.
     */
    public void afficherCode() {
        for (char c : code) {
            System.out.print(c);
        }
        System.out.println();
    }
}

