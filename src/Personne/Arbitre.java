package Personne;
import Epreuve.*;

public class Arbitre {
    private String nom;
    public Arbitre(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void superviserEpreuve(Epreuve epreuve) {

        epreuve.ajouteArbitre(this);
    }

    public String toString() {

        return getNom();
    }
}
