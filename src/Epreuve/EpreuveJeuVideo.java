package Epreuve;

import Personne.Participant;

// Classe représentant une épreuve de jeu vidéo
public class EpreuveJeuVideo extends Epreuve {
    protected String plateforme;
    /**
     * Construit une nouvelle épreuve de jeu vidéo avec les paramètres spécifiés.
     * Le nombre de participants est défini par défaut à 1.
     *
     * @param nom Le nom de l'épreuve.
     * @param bourse La bourse en dollars attribuée pour cette épreuve.
     * @param plateforme La plateforme de jeu vidéo utilisée pour cette épreuve.
     */
    public EpreuveJeuVideo(String nom, double bourse, String plateforme)  {
        super(nom, bourse, 1); // Pour les épreuves de jeu vidéo, le nombre maximum de participants est généralement de 1
        this.plateforme = plateforme;
    }
    /**
     * Obtient la plateforme de jeu vidéo utilisée pour l'épreuve.
     *
     * @return La plateforme de jeu.
     */
    public String getPlateforme() {
        return plateforme;
    }
    /**
     * Implémente le déroulement de l'épreuve de jeu vidéo pour le participant donné.
     *
     * @param participant Le participant qui joue l'épreuve.
     * @return true si le participant réussit l'épreuve en fonction des critères définis par les règles du jeu, false sinon.
     */
    @Override
    public boolean jouer(Participant participant) {

        return false;
    }
}
