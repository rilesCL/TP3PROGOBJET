package Argent;

import Argent.Devise;
import Argent.DollarUS;

// Classe Argent.Euro
public class Euro extends Devise {
    @Override
    public double convertirEn(Devise devise, double montant) {
        if (devise instanceof DollarUS) {
            return montant * 1.11; // Taux de conversion
        } else if (devise instanceof DollarCAN) {
            return montant * 1.39; // Taux de conversion
        }
        return montant;
    }
}