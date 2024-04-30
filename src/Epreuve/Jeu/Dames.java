package Epreuve.Jeu;

import Epreuve.EpreuveJeuDeSociete;
import Lire.Keyboard;
import Personne.Participant;
import Exception.DeplacePionException;

import java.util.Random;

// Classe spécifique pour le jeu de Dames
public class Dames extends EpreuveJeuDeSociete {
    // Méthodes et attributs spécifiques au jeu de Dames
    /**
     * Construit une nouvelle instance de Dames.
     *
     * @param nom Le nom de l'épreuve.
     * @param bourse La bourse en jeu.
     * @param jeu Le nom du jeu.
     * @param maxParticipants Le nombre maximum de participants.
     */
    public Dames(String nom, double bourse, String jeu, int maxParticipants)  {
        super(nom, bourse, jeu, maxParticipants);
    }
    /**
     * Joue une partie du jeu de Dames avec le participant.
     *
     * @param participant Le participant qui joue le jeu.
     * @return Vrai si le participant gagne, faux sinon.
     */
    @Override
    public boolean jouer(Participant participant) {

        Pion cible, pion;

        int noLigne, deplacement;
        char noColonne, direction;
        String str = "";
        Random random = new Random();
        noColonne = (char) (random.nextInt(8) + 'a');
        noLigne = (random.nextInt(8) + 1);
        cible = new Pion(Character.toUpperCase(noColonne), noLigne);
        System.out.println("Positionnez votre pion.");
        System.out.print( "Entrez votre case SVP (A1 à H8): " );
        String coup = Keyboard.readString();
        noColonne = coup.charAt(0);
        noLigne = coup.charAt(1) - '0';
        pion = new Pion(Character.toUpperCase(noColonne), noLigne);
        for (int i = 1; i <= 2 ; i++) {
            Damier.afficheDamier(cible, pion);
            if (pion.capture(cible))
                System.out.println("Vous avez atteint la cible. Bravo!");
            else {
                System.out.println("Cible non atteinte!");
                System.out.println("Bougez votre pion de " + pion + " vers la cible " + cible);
                System.out.print("En ligne droite horizontale (-), verticale (|) " +
                        "ou en diagonal (/, \\) ? ");
                direction = Keyboard.readChar();

                System.out.print( "Entrez le nombre de cases du déplacement: " + str );
                deplacement = Keyboard.readInt();

               try{
                   pion.deplace(direction, deplacement);
               }catch (DeplacePionException e){
                   System.out.println(e.getMessage());
               }

                if (pion.capture(cible)) {
                    System.out.println("Vous avez atteint la cible. Bravo!");
                    Damier.afficheDamier(cible, pion);
                    return true;
                }
                else
                    System.out.println("Cible non atteinte!");
            }
        }
        Damier.afficheDamier(cible, pion);
        return false;
    }
}