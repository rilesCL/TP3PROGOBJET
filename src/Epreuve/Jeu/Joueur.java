package Epreuve.Jeu;

import java.util.ArrayList;

public class Joueur extends Personnage{

    private int experience;
    private ArrayList<Objet>inventaire;
    public Joueur(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
        this.experience = 0;
        this.inventaire = new ArrayList<Objet>();
    }

    public void gagnerExperienceint(int quantite){
        this.experience += quantite;
    }
    public void ajouterObjet(Objet objet) {
        this.inventaire.add(objet);
    }
    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Points de vie: " + this.pointsDeVie + ", Force: " + this.force +
                ", Expérience: " + this.experience + " et Inventaire: " + inventaire.toString();
    }

}
