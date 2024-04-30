package Epreuve.Jeu;

import java.util.ArrayList;

public class Joueur extends Personnage{

    private int experience;
    private ArrayList<Objet>inventaire;
    /**
     * Construit un nouveau joueur avec les informations spécifiées.
     * Initialise également l'expérience à zéro et crée un inventaire vide.
     *
     * @param nom Le nom du joueur.
     * @param pointsDeVie Les points de vie initiaux du joueur.
     * @param force La force initiale du joueur.
     */
    public Joueur(String nom, int pointsDeVie, int force) {
        super(nom, pointsDeVie, force);
        this.experience = 0;
        this.inventaire = new ArrayList<Objet>();
    }
    /**
     * Augmente les points d'expérience du joueur par une quantité donnée.
     *
     * @param quantite La quantité d'expérience à ajouter aux points d'expérience actuels du joueur.
     */
    public void gagnerExperience(int quantite){
        this.experience += quantite;
    }
    /**
     * Ajoute un objet au inventaire du joueur.
     *
     * @param objet L'objet à ajouter à l'inventaire du joueur.
     */
    public void ajouterObjet(Objet objet) {
        this.inventaire.add(objet);
    }
    /**
     * Renvoie une représentation textuelle de l'état actuel du joueur, incluant son nom,
     * ses points de vie, sa force, son expérience et le contenu de son inventaire.
     *
     * @return Une chaîne de caractères décrivant l'état actuel du joueur.
     */
    @Override
    public String toString() {
        return "Nom: " + this.nom + ", Points de vie: " + this.pointsDeVie + ", Force: " + this.force +
                ", Expérience: " + this.experience + " et Inventaire: " + inventaire.toString();
    }

}
