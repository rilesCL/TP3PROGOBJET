package Epreuve.Jeu;

public class Piece {

    /** x-Coordonnées (A - H), les colonnes */
    private char xPos;

    /** y-Coordonnées (1 - 8) les lignes avec 1 en bas et 8 en haut */
    private int yPos;

    /** Constructeur*/

    /**
     * Construit une pièce avec les coordonnées spécifiées.
     * Corrige les positions si elles ne sont pas valides.
     *
     * @param x La colonne initiale de la pièce (A-H).
     * @param y La rangée initiale de la pièce (1-8).
     */
    public Piece (char x, int y) {
        xPos = x;
        yPos = y;
        // Corriger la position si elle est erronée
        corrigerPosition();
    }
    /**
     * Obtient la coordonnée x de la pièce.
     *
     * @return La colonne actuelle de la pièce (A-H).
     */
    public char getXpos () {

        return xPos;
    }
    /**
     * Déplace la pièce de façon relative selon les coordonnées fournies.
     * Corrige automatiquement la position si le déplacement aboutit à une position non valide.
     *
     * @param xF Le nombre de colonnes à déplacer la pièce (peut être négatif).
     * @param yF Le nombre de rangées à déplacer la pièce (peut être négatif).
     */
    public void deplace (int xF, int yF) {
        xPos = (char) (xPos + xF);
        yPos = yPos + yF;
        // corriger si c'est erroné
        corrigerPosition();
    }
    /**
     * Obtient la coordonnée y de la pièce.
     *
     * @return La rangée actuelle de la pièce (1-8).
     */
    public int getYpos () {

        return yPos;
    }
    /**
     * Retourne une représentation textuelle de la pièce avec ses coordonnées actuelles.
     *
     * @return Une chaîne de caractères décrivant la pièce et sa position.
     */
    public String toString() {

        return "Pièce à la position " + xPos + yPos;
    }

    /** Corriger la position */
    /**
     * Corrige les coordonnées de la pièce pour s'assurer qu'elles sont valides.
     * Si la pièce sort du damier, ses coordonnées sont ajustées aux bords les plus proches.
     */
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
