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
    /**
     * Constructeur pour créer une épreuve avec un nom et une bourse initiale.
     *
     * @param nom Le nom de l'épreuve.
     * @param bourse La bourse en dollars attribuée pour cette épreuve.
     */
    public Epreuve(String nom, double bourse)  {
        this.nom = nom;
        this.bourse = bourse;
        this.setMaxParticipants(1);
    }
    /**
     * Constructeur pour créer une épreuve avec un nom, une bourse, et un nombre maximal de participants.
     *
     * @param nom Le nom de l'épreuve.
     * @param bourse La bourse en dollars attribuée pour cette épreuve.
     * @param maxParticipants Le nombre maximal de participants autorisés pour l'épreuve.
     */
    public Epreuve(String nom, double bourse, int maxParticipants) {
        this(nom, bourse); // Appel du constructeur principal avec this
        this.setMaxParticipants(maxParticipants);
    }
    /**
     * Retourne la bourse associée à cette épreuve.
     *
     * @return La bourse en dollars.
     */
    public double getBourse() {

        return bourse;
    }
    /**
     * Définit le nombre maximal de participants pour l'épreuve.
     *
     * @param maxParticipants Le nombre maximal de participants.
     */
    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants= maxParticipants;
    }
    /**
     * Ajoute un participant à l'épreuve.
     *
     * @param p Le participant à ajouter.
     * @throws AjoutParticipantException Si le nombre maximum de participants est déjà atteint.
     */
    public void ajouteParticipant(Participant p) throws AjoutParticipantException {
        if (participants.size() < maxParticipants)
            participants.add(p);
        else
           throw new AjoutParticipantException("Nombre maximum de participants atteints.");
    }

    /**
     * Ajoute un arbitre à l'épreuve.
     *
     * @param a L'arbitre à ajouter.
     */
    public void ajouteArbitre(Arbitre a) {
        arbitres.add(a);
    }
    /**
     * Retourne la liste des participants à l'épreuve.
     *
     * @return Une liste de participants.
     */
    public ArrayList<Participant> getParticipants() {
        return participants;
    }
    /**
     * Retourne la liste des arbitres de l'épreuve.
     *
     * @return Une liste d'arbitres.
     */
    public ArrayList<Arbitre> getArbitres() {
        return arbitres;
    }
    /**
     * Renvoie une chaîne de caractères décrivant l'épreuve avec des détails sur les participants et les arbitres.
     *
     * @return Une description détaillée de l'épreuve.
     */
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
    /**
     *
     * @param participant Le participant qui joue l'épreuve.
     * @return true si le participant réussit l'épreuve, false sinon.
     */
    public abstract boolean jouer(Participant participant);
}