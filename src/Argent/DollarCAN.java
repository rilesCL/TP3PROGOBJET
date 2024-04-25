package Argent;

import Argent.Devise;
import Argent.DollarUS;
import Argent.Euro;

// Classe Argent.DollarCAN
public class DollarCAN extends Devise {
    @Override
    public double convertirEn(Devise devise, double montant) {
        if (devise instanceof DollarUS) {
            return montant * 0.8; // Taux de conversion
        } else if (devise instanceof Euro) {
            return montant * 0.72; // Taux de conversion
        }
        return montant;
    }
}