package Epreuve.Jeu;

public class Objet {
    private String nom;
    /**
     * Construit un objet avec un nom spécifié.
     *
     * @param nom Le nom de l'objet.
     */
    public Objet(String nom) {
        this.nom = nom;
    }
    /**
     * Représentation textuelle de l'objet.
     *
     * @return Le nom de l'objet.
     */
    @Override
    public String toString() {
        return nom;
    }
}
