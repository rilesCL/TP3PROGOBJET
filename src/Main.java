import Epreuve.*;
import Epreuve.Jeu.Dames;
import Epreuve.Jeu.Mastermind;
import Personne.*;
import Temps.*;


// Classe principale du tournoi
public class Main {
    public static void main(String[] args){
            Epreuve epreuveJeuDeSociete = new EpreuveJeuDeSociete("Épreuve régionale", 1000, "Monopoly", 2);
            Epreuve epreuveJeuDeRole = new EpreuveJeuDeRole("Aventure épique", 2000, "La quête du dragon", 2);
            Epreuve epreuveJeuVideo = new EpreuveJeuVideo("Épreuve de Mario Kart", 3000, "Nintendo Switch");
            Epreuve epreuveDames = new Dames("Rencontre mensuel", 4000, "Dames", 2);
            Epreuve epreuveMastermind = new Mastermind("Épreuve avec invitation", 5000, "Mastermind", 2);
            //Epreuve epreuveLegendes = new Leg endes("Épreuve ouverte", 4000, "Légendes", 2);
            Tournoi tournoi = new Tournoi(); // Temps.Calendrier d'épreuves dans un HashTable, donc pas d'ordre
            tournoi.ajouterEpreuve(epreuveJeuDeSociete, new CaseHoraire(Jour.LUNDI,20));
            tournoi.ajouterEpreuve(epreuveJeuDeRole, new CaseHoraire(Jour.MARDI,19));
            tournoi.ajouterEpreuve(epreuveJeuVideo, new CaseHoraire(Jour.MERCREDI,21));
            tournoi.ajouterEpreuve(epreuveDames, new CaseHoraire(Jour.SAMEDI,13));
            tournoi.ajouterEpreuve(epreuveMastermind, new CaseHoraire(Jour.SAMEDI,15));
            //tournoi.ajouterEpreuve(epreuveLegendes, new Temps.CaseHoraire(Temps.Jour.LUNDI,15));
            // Inscription des participants:
            Participant alice = new Participant("Ricardo", Provenance.EUROPE);
            Participant ricardo = new Participant("Alice", Provenance.CANADA);
            Participant james = new Participant("James", Provenance.US);
            Participant tina = new Participant("Tina", Provenance.EUROPE);
            Participant rene = new Participant("René", Provenance.CANADA);
            Participant megan = new Participant("Megan", Provenance.US);
            alice.sInscrireEpreuve(epreuveJeuDeSociete);  // Dans Epreuve: liste de participants
            ricardo.sInscrireEpreuve(epreuveJeuDeSociete);
            ricardo.sInscrireEpreuve(epreuveJeuDeRole);
            james.sInscrireEpreuve(epreuveJeuVideo);
            tina.sInscrireEpreuve(epreuveDames);
            rene.sInscrireEpreuve(epreuveMastermind);
            //megan.sInscrireEpreuve(epreuveLegendes);
            // Supervision de l'épreuve par un arbitre
            Arbitre carole = new Arbitre("Carole"); // Dans Epreuve: liste d'arbitres
            carole.superviserEpreuve(epreuveJeuDeSociete);
            carole.superviserEpreuve(epreuveJeuDeRole);
            carole.superviserEpreuve(epreuveJeuVideo);
            Arbitre pierre = new Arbitre("Pierre");
            pierre.superviserEpreuve(epreuveJeuVideo);
            pierre.superviserEpreuve(epreuveDames);
            Arbitre lina = new Arbitre("Lina");
            lina.superviserEpreuve(epreuveMastermind);
            //lina.superviserEpreuve(epreuveLegendes);
            System.out.println(tournoi);
            tournoi.demarrerTournoi();
    }
}
