package Epreuve;

import Personne.Participant;


// Classe représentant une épreuve de jeu de société
public class EpreuveJeuDeSociete extends Epreuve {
    protected String jeu;
    /**
     * Construit une nouvelle épreuve de jeu de société avec les paramètres spécifiés.
     *
     * @param nom Le nom de l'épreuve.
     * @param bourse La bourse en dollars attribuée pour cette épreuve.
     * @param jeu Le nom du jeu de société qui sera joué pendant l'épreuve.
     * @param maxParticipants Le nombre maximal de participants autorisés pour l'épreuve.
     */
    public EpreuveJeuDeSociete(String nom, double bourse, String jeu, int maxParticipants) {
        super(nom, bourse, maxParticipants);
        this.jeu = jeu;
    }
    /**
     * Obtient le nom du jeu de société associé à cette épreuve.
     *
     * @return Le nom du jeu de société.
     */
    public String getJeu() {
        return jeu;
    }
    /**
     * Donne le déroulement de l'épreuve de jeu de société pour le participant donné.
     *
     * @param participant Le participant qui joue l'épreuve.
     * @return true si le participant réussit l'épreuve en fonction des critères définis par les règles du jeu, false sinon.
     */
    @Override
    public boolean jouer(Participant participant) {

        return false;
    }

}
