package Epreuve;

import Personne.Participant;

// Classe représentant une épreuve de jeu de rôle
public class EpreuveJeuDeRole extends Epreuve {
    private String scenario;

    public EpreuveJeuDeRole(String nom, double bourse, String scenario, int maxParticipants)  {
        super(nom, bourse, maxParticipants);
        this.scenario = scenario;
    }
    public String getScenario() {
        return scenario;
    }
    @Override
    public boolean jouer(Participant participant) {

        return false;
    }

}
