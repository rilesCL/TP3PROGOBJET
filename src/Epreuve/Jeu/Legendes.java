package Epreuve.Jeu;

import Epreuve.EpreuveJeuDeRole;
import Personne.Participant;

public class Legendes extends EpreuveJeuDeRole {
    public Legendes(String nom, double bourse, String jeu, int maxParticipants) {
        super(nom, bourse, jeu, maxParticipants);
    }

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
