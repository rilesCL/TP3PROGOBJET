package Argent;

// Classe abstraite Devise
public abstract class Devise {
    /**
     * Convertit un montant de cette devise en une autre devise.
     *
     * @param devise  la devise cible pour la conversion.
     * @param montant le montant de la devise actuelle à convertir.
     * @return le montant converti dans la devise cible.
     */
    public abstract double convertirEn(Devise devise, double montant);
}
