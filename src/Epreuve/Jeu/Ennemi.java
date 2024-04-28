package Epreuve.Jeu;

public class Ennemi extends Personnage{
    private int niveau;
    private Object butin;
    public Ennemi(String nom, int pointsDeVie, int force, int niveau, Object butin) {
        super(nom, pointsDeVie, force);
        this.niveau = niveau;
        this.butin = butin;
    }
    public void perdreButin() {
        this.butin = null;
    }
    public void perdreNiveau() {
        if (this.niveau > 0) {
            this.niveau--;
        }
    }

    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Points de vie: " + this.pointsDeVie + ", Force: " + this.force +
                ", Niveau: " + this.niveau + ", Butin: " + (butin != null ? butin.toString() : "Aucun");
    }

    public Objet getButin() {
        return (Objet) butin;
    }

    public int getNiveau() {
        return niveau;
    }
}
