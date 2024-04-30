package Personne;
import Epreuve.*;
import Exception.AjoutParticipantException;

public class Participant {
    private String nom;
    private Provenance provenance;
    /**
     * Construit un participant avec un nom et une provenance spécifiés.
     *
     * @param nom Le nom du participant.
     * @param provenance La provenance du participant.
     */
    public Participant(String nom, Provenance provenance) {
        this.nom = nom;
        this.provenance = provenance;
    }
    /**
     * Obtient le nom du participant.
     *
     * @return Le nom du participant.
     */
    public String getNom() {

        return nom;
    }
    /**
     * Obtient la provenance du participant.
     *
     * @return La provenance du participant.
     */
    public Provenance getProvenance() {

        return provenance;
    }

    /**
     * Tente de s'inscrire à une épreuve. Si l'épreuve est pleine, une exception est lancée.
     *
     * @param epreuve L'épreuve à laquelle le participant veut s'inscrire.
     */
    public void sInscrireEpreuve(Epreuve epreuve) {
        try {
            epreuve.ajouteParticipant(this);
        } catch (AjoutParticipantException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Retourne une chaîne de caractères représentant le participant.
     *
     * @return Une chaîne qui inclut le nom et la provenance du participant.
     */
    public String toString() {

        return getNom() + " (" + getProvenance() + ")";
    }
}
