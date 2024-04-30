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
    /**
     * Attaque une autre personnage et lui inflige des dégâts équivalents à la force de ce personnage.
     *
     * @param cible Le personnage ciblé par l'attaque.
     */
    public void attaquer(Personnage cible){
        cible.subirDegats(force);
    }
    /**
     * Subit des dégâts, réduisant les points de vie du personnage.
     *
     * @param degats La quantité de dégâts infligés.
     */
    public void subirDegats(int degats){
        pointsDeVie -= degats;
        if(pointsDeVie <= 0){
            pointsDeVie = 0;
        }
    }
    /**
     * Retourne les points de vie actuels du personnage.
     *
     * @return Les points de vie restants du personnage.
     */
    public int getPointsDeVie() {
        return pointsDeVie;
    }
}
