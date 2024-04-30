package Epreuve;

import Personne.Participant;

// Classe représentant une épreuve de jeu de rôle
public class EpreuveJeuDeRole extends Epreuve {
    private String scenario;
    /**
     * Construit une épreuve de jeu de rôle avec les paramètres spécifiés.
     *
     * @param nom Le nom de l'épreuve.
     * @param bourse La bourse en dollars attribuée pour cette épreuve.
     * @param scenario Le scénario spécifique de l'épreuve de jeu de rôle.
     * @param maxParticipants Le nombre maximal de participants autorisés pour l'épreuve.
     */
    public EpreuveJeuDeRole(String nom, double bourse, String scenario, int maxParticipants)  {
        super(nom, bourse, maxParticipants);
        this.scenario = scenario;
    }
    /**
     * Obtient le scénario de l'épreuve de jeu de rôle.
     *
     * @return Le scénario sous forme de texte.
     */
    public String getScenario() {
        return scenario;
    }
    /**
     * donne le jeu de l'épreuve pour le participant donné.
     *
     * @param participant Le participant qui joue l'épreuve.
     * @return true si le participant réussit l'épreuve en fonction des critères définis par le scénario, false sinon.
     */
    @Override
    public boolean jouer(Participant participant) {

        return false;
    }

}
