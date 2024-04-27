package Epreuve.Jeu;

public class Ennemi extends Personnage{
    private int niveau;
    private Object butin;
    public Ennemi(String nom, int pointsDeVie, int force, int niveau, Object butin) {
        super(nom, pointsDeVie, force);
        this.niveau = 0;
        this.butin = butin;
    }
}
