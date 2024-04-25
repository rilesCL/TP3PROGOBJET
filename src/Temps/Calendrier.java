package Temps;

import java.util.Hashtable;
public class Calendrier {
    // Classe pour le calendrier
    private Hashtable<CaseHoraire, Epreuve> epreuves;
    public Calendrier() {

        epreuves = new Hashtable<>();
    }
    public void entrerEpreuve(Epreuve epreuve, CaseHoraire caseHoraire) {

        epreuves.put(caseHoraire, epreuve);
    }

    public Hashtable<CaseHoraire, Epreuve> getEpreuves() {

        return epreuves;
    }
    public String toString() {
        String out = "";
        for (CaseHoraire cle : epreuves.keySet())
            out += (cle + "\n\t" + epreuves.get(cle) + "\n");
        return out;
    }
}

