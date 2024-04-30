package Personne;
import Epreuve.*;

public class Arbitre {
    private String nom;
    /**
     * Crée un arbitre avec un nom spécifié.
     *
     * @param nom Le nom de l'arbitre.
     */
    public Arbitre(String nom) {
        this.nom = nom;
    }
    /**
     * Récupère le nom de l'arbitre.
     *
     * @return Le nom de l'arbitre.
     */
    public String getNom() {
        return nom;
    }
    /**
     * Permet à l'arbitre de superviser une épreuve spécifique.
     *
     * @param epreuve L'épreuve que l'arbitre doit superviser.
     */
    public void superviserEpreuve(Epreuve epreuve) {

        epreuve.ajouteArbitre(this);
    }
    /**
     * Retourne une chaîne de caractères qui représente le nom de l'arbitre.
     *
     * @return Le nom de l'arbitre.
     */
    public String toString() {

        return getNom();
    }
}
