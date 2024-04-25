package Epreuve;

import Personne.Participant;

// Classe représentant une épreuve de jeu vidéo
public class EpreuveJeuVideo extends Epreuve {
    protected String plateforme;
    public String getPlateforme() {
        return plateforme;
    }
    public EpreuveJeuVideo(String nom, double bourse, String plateforme)  {
        super(nom, bourse, 1); // Pour les épreuves de jeu vidéo, le nombre maximum de participants est généralement de 1
        this.plateforme = plateforme;
    }

    @Override
    public boolean jouer(Participant participant) {

        return false;
    }
}
