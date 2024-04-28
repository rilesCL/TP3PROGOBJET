package Epreuve.Jeu;

import Exception.DeplacePionException;
public class Pion extends Piece {

    public Pion(char x, int y) {

        super( x, y);
    }

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

    public boolean capture (Pion cible) {

        return getXpos() == cible.getXpos() && getYpos() == cible.getYpos();
    }

    public String toString() {

        return getXpos() + "" + getYpos();
    }

}
