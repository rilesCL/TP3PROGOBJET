package Argent;

// Classe Argent.DollarUS
public class DollarUS extends Devise {
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