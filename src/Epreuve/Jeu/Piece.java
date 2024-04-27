package Epreuve.Jeu;

public class Piece {

    /** x-Coordonnées (A - H), les colonnes */
    private char xPos;

    /** y-Coordonnées (1 - 8) les lignes avec 1 en bas et 8 en haut */
    private int yPos;

    /** Constructeur*/
    public Piece (char x, int y) {
        xPos = x;
        yPos = y;
        // Corriger la position si elle est erronée
        corrigerPosition();
    }

    public char getXpos () {

        return xPos;
    }

    public void deplace (int xF, int yF) {
        xPos = (char) (xPos + xF);
        yPos = yPos + yF;
        // corriger si c'est erroné
        corrigerPosition();
    }

    public int getYpos () {

        return yPos;
    }

    public String toString() {

        return "Pièce à la position " + xPos + yPos;
    }

    /** Corriger la position */
    private void corrigerPosition () {
        if (xPos < 'A')
            xPos = 'A';
        else if (xPos > 'H')
            xPos = 'H';
        if (yPos < 1)
            yPos = 1;
        else if (yPos > 8)
            yPos = 8;
    }


}
