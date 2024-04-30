import Argent.DollarCAN;
import Argent.DollarUS;
import Argent.Euro;
import Epreuve.Epreuve;
import Personne.Participant;
import Personne.Provenance;
import Temps.Calendrier;
import Temps.CaseHoraire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Epreuve.*;

// Classe représentant un tournoi de jeux
public class Tournoi {
    private Calendrier calendrier;
    /**
     * Construit un nouveau tournoi avec un calendrier vide.
     */

    public Tournoi() {
        calendrier = new Calendrier();
    }
    /**
     * Ajoute une épreuve à un horaire spécifique dans le calendrier du tournoi.
     *
     * @param epreuve L'épreuve à ajouter au tournoi.
     * @param caseHoraire L'horaire auquel l'épreuve doit être placée.
     */
    public void ajouterEpreuve(Epreuve epreuve, CaseHoraire caseHoraire) {
        calendrier.entrerEpreuve(epreuve, caseHoraire);
    }
    /**
     * Démarre le tournoi et exécute toutes les épreuves dans l'ordre chronologique.
     * Affiche les résultats et les détails des épreuves au fur et à mesure de leur exécution.
     */
    public void demarrerTournoi() {
        List<CaseHoraire> cles = new ArrayList<>(calendrier.getEpreuves().keySet());
        Collections.sort(cles);
        System.out.println("***** Le tournoi démarre. On jouera dans l'ordre chronologique du calendrier.");
        // On joue dans l'ordre trié du calendrier
        for (CaseHoraire cle : cles) {
            System.out.println("\nCase Horaire: " + cle);
            Epreuve epreuve = calendrier.getEpreuves().get(cle);
            System.out.println("Épreuve: " + epreuve);
            if (epreuve instanceof EpreuveJeuDeSociete)
                System.out.println("C'est une épreuve de jeu de société: le jeu est " + ((EpreuveJeuDeSociete) epreuve).getJeu());
            else if (epreuve instanceof EpreuveJeuDeRole)
                System.out.println("C'est une épreuve de jeu de rôle: le scénario est " + ((EpreuveJeuDeRole) epreuve).getScenario());
            else if (epreuve instanceof EpreuveJeuVideo)
                System.out.println("C'est une épreuve de jeu vidéo: la plateforme est " + ((EpreuveJeuVideo) epreuve).getPlateforme());
            for (Participant participant: epreuve.getParticipants()) {
                System.out.print(participant + " va jouer. La bourse dans la bonne devise est de : ");
                DollarUS dollarUS = new DollarUS();
                if (participant.getProvenance() == Provenance.CANADA)
                    System.out.println( dollarUS.convertirEn(new DollarCAN(), epreuve.getBourse()) + " en $CAN" );
                else if (participant.getProvenance() == Provenance.EUROPE)
                    System.out.println( dollarUS.convertirEn(new Euro(), epreuve.getBourse()) + " en EURO");
                else if (participant.getProvenance() == Provenance.US)
                    System.out.println( dollarUS.convertirEn(new DollarUS(), epreuve.getBourse()) + " en $US" );
                boolean resultat = epreuve.jouer(participant);
                if (resultat)
                    System.out.println(participant + " a fini de jouer et a gagné!");
                else
                    System.out.println(participant + " a fini de jouer et a perdu ou ce type de jeu n'a pas encore été implémenté.");
            }
        }
    }
    /**
     * Retourne une représentation textuelle du calendrier du tournoi.
     *
     * @return Une chaîne de caractères représentant le calendrier du tournoi.
     */
    public String toString() {
        return calendrier.toString();
    }
}
