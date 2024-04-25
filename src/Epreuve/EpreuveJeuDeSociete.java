package Epreuve;

import Personne.Participant;

// Classe représentant une épreuve de jeu de société
public class EpreuveJeuDeSociete extends Epreuve {
    protected String jeu;
    public EpreuveJeuDeSociete(String nom, double bourse, String jeu, int maxParticipants) {
        super(nom, bourse, maxParticipants);
        this.jeu = jeu;
    }
    public String getJeu() {
        return jeu;
    }
    @Override
    public boolean jouer(Participant participant) {

        return false;
    }

}
