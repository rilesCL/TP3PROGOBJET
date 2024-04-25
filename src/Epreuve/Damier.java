package Epreuve;

public class Damier {

    public static void afficheDamier(Piece cible, Piece pion) {

        for (int ligne = 8; ligne >= 1; ligne--) {
            for (char col = 'A'; col <= 'H'; col++)
                if (cible.getXpos() == col && cible.getYpos() == ligne && pion.getXpos() == col && pion.getYpos() == ligne)
                    System.out.print("!");
                else if (cible.getXpos() == col && cible.getYpos() == ligne)
                    System.out.print("O");
                else if (pion.getXpos() == col && pion.getYpos() == ligne)
                    System.out.print("X");
                else
                    System.out.print("_");
            System.out.println();
        }
    }
}
