package Epreuve;

import Lire.Keyboard;
import Personne.Participant;

import java.util.Random;

public class Mastermind extends EpreuveJeuDeSociete {
    // Méthodes et attributs spécifiques au jeu de Dames
    public Mastermind(String nom, double bourse, String jeu, int maxParticipants)  {
        super(nom, bourse, jeu, maxParticipants);
    }
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
        char[] tous = {epee, david, liberte, rosace, avion, telegraphe};

        char[] ordinateur = {epee, david, rosace, rosace};
        System.out.print("Ordinateur = ");
        for (char c : ordinateur) {
            System.out.print(c);
        }
        System.out.println();
        boolean trouve = false;
        Random random = new Random();
        for (int essai = 0; essai < 12; essai++) {
            System.out.print("Entrez votre essai #" + (essai + 1) + " SVP [EDRATL]: ");
            String humain = Keyboard.readString().toUpperCase();
            System.out.println("Humain = " + humain);
            char[] humainArray = humain.toCharArray();
            if (humain.equals(String.valueOf(ordinateur))) {
                System.out.println("Vous avez gagné !");
                trouve = true;
                break;
            } else if (humainArray.length != 4) {
                System.out.println("Votre essai est d'une longueur différente de 4. Réessayez.");
            } else {
                StringBuilder indices = new StringBuilder();
                boolean[] libreOrdi = {true, true, true, true};
                boolean[] libreHuma = {true, true, true, true};
                for (int i = 0; i < ordinateur.length; i++) {
                    if (ordinateur[i] == humainArray[i]) {
                        libreOrdi[i] = false;
                        libreHuma[i] = false;
                        indices.append(point_noir);
                    }
                }
                for (int i = 0; i < ordinateur.length; i++) {
                    for (int j = 0; j < humainArray.length; j++) {
                        if (i != j && ordinateur[i] == humainArray[j] && libreOrdi[i] && libreHuma[j]) {
                            libreOrdi[i] = false;
                            libreHuma[j] = false;
                            indices.append(point_blanc);
                        }
                    }
                }
                if (indices.length() == 0) {
                    indices.append("aucune");
                }
                System.out.println("\tVoici vos indices : " + indices);
            }
        }
        if (!trouve) {
            System.out.println("Vous avez épuisé vos 12 essais.");
            return false;
        }
        else
            return true;

    }
}