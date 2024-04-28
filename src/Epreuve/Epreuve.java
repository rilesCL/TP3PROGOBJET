package Epreuve;

import java.util.ArrayList;
import Personne.Arbitre;
import Personne.Participant;
import Exception.AjoutParticipantException;


// Classe abstraite représentant une épreuve du tournoi
public abstract class Epreuve {
    protected String nom;
    protected double bourse;
    protected int maxParticipants;
    protected ArrayList<Participant> participants = new ArrayList<Participant>();
    protected ArrayList<Arbitre> arbitres = new ArrayList<Arbitre>();
    public Epreuve(String nom, double bourse)  {
        this.nom = nom;
        this.bourse = bourse;
        this.setMaxParticipants(1);
    }

    public Epreuve(String nom, double bourse, int maxParticipants) {
        this(nom, bourse); // Appel du constructeur principal avec this
        this.setMaxParticipants(maxParticipants);
    }
    public double getBourse() {

        return bourse;
    }
    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants= maxParticipants;
    }

    public void ajouteParticipant(Participant p) throws AjoutParticipantException {
        if (participants.size() < maxParticipants)
            participants.add(p);
        else
           throw new AjoutParticipantException("Nombre maximum de participants atteints.");
    }


    public void ajouteArbitre(Arbitre a) {
        arbitres.add(a);
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public ArrayList<Arbitre> getArbitres() {
        return arbitres;
    }

    public String toString() {
        String participants = "\t";
        for (Participant item : getParticipants()) {
            participants += item + "\t";
        }
        String arbitres = "\t";
        for (Arbitre item : getArbitres()) {
            arbitres += item + "\t";
        }
        return nom + ", Bourse($US " + bourse + "), Maximum de participants: " + maxParticipants + "\n"
                + "\tParticipants: " + participants + "\n"
                + "\tArbitres: " + arbitres;
    }
    // Méthode abstraite pour jouer l'épreuve
    public abstract boolean jouer(Participant participant);
}