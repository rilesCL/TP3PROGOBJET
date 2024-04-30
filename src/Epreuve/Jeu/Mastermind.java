package Epreuve.Jeu;

import Epreuve.EpreuveJeuDeSociete;
import Lire.Keyboard;
import Personne.*;

public class Mastermind extends EpreuveJeuDeSociete {
    // Méthodes et attributs spécifiques au jeu de Dames
    /**
     * Construit une épreuve Mastermind avec les paramètres spécifiés.
     *
     * @param nom             Le nom de l'épreuve.
     * @param bourse          La bourse en jeu pour l'épreuve.
     * @param jeu             Le nom du jeu associé à l'épreuve.
     * @param maxParticipants Le nombre maximum de participants pour cette épreuve.
     */
    public Mastermind(String nom, double bourse, String jeu, int maxParticipants)  {
        super(nom, bourse, jeu, maxParticipants);
    }
    /**
     * Fait jouer le jeu de Mastermind au participant.
     *
     * @param participant Le participant qui joue le jeu.
     * @return Vrai si le participant devine correctement le code, faux autrement.
     */
    @Override
    public boolean jouer(Participant participant) {
        char point_noir = '\u2022'; // Bien placé
        char point_blanc = '\u25CB'; // Mal placé
        char epee = 'E'; // Épée
        char david = 'D'; // Étoile de David
        char liberte = 'L'; // Liberté
        char rosace = 'R'; // Rosace
        char avion = 'A'; // Avion
        char telegraphe = 'T'; // Télégraphe
        Humain joueurHumain = new Humain();
        Ordinateur ordinateur = new Ordinateur(new char[]{epee, david, rosace, rosace});
        System.out.print("Ordinateur = ");
        ordinateur.afficherCode();
        boolean trouve = false;
        for (int essai = 0; essai < 12; essai++) {
            System.out.print("Entrez votre essai #" + (essai + 1) + " SVP [EDRATL]: ");
            String humain = Keyboard.readString().toUpperCase();
            System.out.println("Humain = " + humain);
            if (joueurHumain.verifierVictoire(humain, ordinateur.getCode())) {
                System.out.println("Vous avez gagné !");
                trouve = true;
                break;
            }
            else if (humain.length() != 4)
                System.out.println("Votre essai est d'une longueur différente de 4. Réessayez.");
            else
                joueurHumain.afficherIndices(humain, ordinateur.getCode());
        }
        if (!trouve) {
            System.out.println("Vous avez épuisé vos 12 essais.");
            return false;
        }
        else
            return true;
    }


}