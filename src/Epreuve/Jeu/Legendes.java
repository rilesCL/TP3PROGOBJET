package Epreuve.Jeu;

import Epreuve.EpreuveJeuDeRole;
import Personne.Participant;

public class Legendes extends EpreuveJeuDeRole {
    /**
     * Construit une épreuve du type légendes avec les paramètres spécifiés.
     *
     * @param nom             Le nom de l'épreuve.
     * @param bourse          La bourse en jeu pour l'épreuve.
     * @param jeu             Le nom du jeu associé à l'épreuve.
     * @param maxParticipants Le nombre maximum de participants pour cette épreuve.
     */
    public Legendes(String nom, double bourse, String jeu, int maxParticipants) {
        super(nom, bourse, jeu, maxParticipants);
    }
    /**
     * Fait jouer l'épreuve de légendes au participant.
     *
     * @param participant Le participant qui joue l'épreuve.
     * @return Vrai si le participant gagne, faux autrement.
     */
    public boolean jouer(Participant participant){
        boolean gain = false;
       Joueur joueur = new Joueur(participant.getNom(),100, 25);
       System.out.println(joueur + "\n");

       Objet epee = new Objet("Épée");
       Objet casque = new Objet("Casque");

       joueur.ajouterObjet(epee);
       joueur.ajouterObjet(casque);
       System.out.println(joueur + "\n");

       Objet potion = new Objet("Potion de guérison");
       Ennemi ennemi = new Ennemi("Dragon",20, 20, 5, potion);
       System.out.println(ennemi + "\n");

       joueur.attaquer(ennemi);
       System.out.println();

       if (ennemi.getPointsDeVie() <= 0){

           joueur.ajouterObjet(ennemi.getButin());
           ennemi.perdreButin();

           joueur.gagnerExperience(ennemi.getNiveau() * 5);


           ennemi.perdreNiveau();
           gain = true;
       }
       System.out.println(joueur);
       System.out.println(ennemi);
       return gain;

    }
}
