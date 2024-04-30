package Epreuve.Jeu;

import Exception.DeplacePionException;
public class Pion extends Piece {
    /**
     * Construit un pion avec des coordonnées spécifiées sur le plateau.
     *
     * @param x La coordonnée horizontale initiale du pion.
     * @param y La coordonnée verticale initiale du pion.
     */
    public Pion(char x, int y) {

        super( x, y);
    }
    /**
     * Déplace le pion dans une direction spécifiée pour un nombre donné de cases.
     *
     * @param direction La direction du déplacement ('-', '|', '/', '\').
     * @param deplacement Le nombre de cases à déplacer.
     * @throws DeplacePionException Si la direction spécifiée est illégale.
     */
    public void deplace (char direction, int deplacement) throws DeplacePionException
    {
        switch (direction) {

            case '-':
                deplace( deplacement, 0 );
                break;

            case '|':
                deplace( 0, deplacement );
                break;

            case '/':
                deplace( deplacement, deplacement );
                break;

            case '\\':
                deplace( deplacement, -deplacement );
                break;

            default:
                throw new DeplacePionException( "Déplacement illégal!" );

        }

    }
    /**
     * Vérifie si ce pion a capturé un autre pion spécifié.
     *
     * @param cible Le pion cible à vérifier pour la capture.
     * @return Vrai si ce pion a capturé le pion cible, faux sinon.
     */
    public boolean capture (Pion cible) {

        return getXpos() == cible.getXpos() && getYpos() == cible.getYpos();
    }
    /**
     * Retourne une représentation textuelle de la position du pion.
     *
     * @return La coordonnée du pion sous forme de chaîne de caractères.
     */
    public String toString() {

        return getXpos() + "" + getYpos();
    }

}
