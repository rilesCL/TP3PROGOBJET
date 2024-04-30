package Epreuve.Jeu;

public class Personnage {
    protected String nom;
    protected int pointsDeVie;
    protected int force;
    /**
     * Construit un personnage avec les attributs spécifiés.
     *
     * @param nom         Le nom du personnage.
     * @param pointsDeVie Les points de vie du personnage.
     * @param force       La force du personnage.
     */
    public Personnage(String nom, int pointsDeVie, int force){
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
    }

    public void attaquer(Personnage cible){
        cible.subirDegats(force);
    }
    public void subirDegats(int degats){
        pointsDeVie -= degats;
        if(pointsDeVie <= 0){
            pointsDeVie = 0;
        }
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }
}
