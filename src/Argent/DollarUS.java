package Argent;

// Classe Argent.DollarUS
public class DollarUS extends Devise {
    /**
     * Convertit un montant de Dollars US en une autre devise spécifiée.
     *
     * @param devise  la devise cible pour la conversion (Dollar Canadien ou Euro).
     * @param montant le montant en Dollars US à convertir.
     * @return le montant converti dans la devise cible, ou le montant initial si la devise cible est inconnue.
     */
    @Override
    public double convertirEn(Devise devise, double montant) {
        if (devise instanceof DollarCAN) {
            return montant * 1.25; // Taux de conversion
        } else if (devise instanceof Euro) {
            return montant * 0.9; // Taux de conversion
        }
        return montant;
    }
}