package Temps;

public class CaseHoraire implements Comparable<CaseHoraire>{

    private Jour jour;
    private int heure;

    public CaseHoraire(Jour jour, int heure) {
        this.heure = heure;
        this.jour = jour;
    }dsf

    @Override
    public int compareTo(CaseHoraire caseHoraire)
    {
        if (this.jour.ordinal() > caseHoraire.jour.ordinal() || this.jour.ordinal() == caseHoraire.jour.ordinal() && this.heure > caseHoraire.heure) {
            return 1;
        }
        else if (this.jour.ordinal() < caseHoraire.jour.ordinal() || this.jour.ordinal() == caseHoraire.jour.ordinal() && this.heure < caseHoraire.heure) {
            return -1;
        }
        else {
            return 0;
        }
    }
    public String toString() {

        return jour + " (" + heure + " hr)";
    }
}
