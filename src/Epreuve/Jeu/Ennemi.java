package Epreuve.Jeu;

public class Ennemi extends Personnage{
    private int niveau;
    private Object butin;
    /**
     * Construit un nouvel ennemi avec un nom, des points de vie, une force, un niveau et un butin.
     *
     * @param nom Le nom de l'ennemi.
     * @param pointsDeVie Les points de vie de l'ennemi.
     * @param force La force de l'ennemi.
     * @param niveau Le niveau de l'ennemi.
     * @param butin Le butin de l'ennemi.
     */
    public Ennemi(String nom, int pointsDeVie, int force, int niveau, Object butin) {
        super(nom, pointsDeVie, force);
        this.niveau = niveau;
        this.butin = butin;
    }
    /**
     * Supprime le butin de l'ennemi, rendant l'ennemi sans butin.
     */
    public void perdreButin() {
        this.butin = null;
    }
    /**
     * Diminue le niveau de l'ennemi de un, jusqu'à un minimum de zéro.
     */
    public void perdreNiveau() {
        if (this.niveau > 0) {
            this.niveau--;
        }
    }
    /**
     * Renvoie une chaine textuelle de l'ennemi avec son nom, ses points de vie,
     * sa force, son niveau et son butin.
     *
     * @return Une chaîne de caractères décrivant l'ennemi.
     */
    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Points de vie: " + this.pointsDeVie + ", Force: " + this.force +
                ", Niveau: " + this.niveau + ", Butin: " + (butin != null ? butin.toString() : "Aucun");
    }
    /**
     * Obtient le butin détenu par l'ennemi.
     *
     * @return Le butin de l'ennemi si présent, sinon retourne null.
     */
    public Objet getButin() {
        return (Objet) butin;
    }
    /**
     * Obtient le niveau actuel de l'ennemi.
     *
     * @return Le niveau actuel de l'ennemi.
     */
    public int getNiveau() {
        return niveau;
    }
}
