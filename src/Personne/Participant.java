package Personne;
import Epreuve.*;

public class Participant {
    private String nom;
    private Provenance provenance;

    public Participant(String nom, Provenance provenance) {
        this.nom = nom;
        this.provenance = provenance;
    }

    public String getNom() {

        return nom;
    }

    public Provenance getProvenance() {

        return provenance;
    }

    public void sInscrireEpreuve(Epreuve epreuve) {
        epreuve.ajouteParticipant(this);
    }


    public String toString() {

        return getNom() + " (" + getProvenance() + ")";
    }
}
