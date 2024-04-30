package Argent;

import Argent.Devise;
import Argent.DollarUS;
import Argent.Euro;

// Classe Argent.DollarCAN
public class DollarCAN extends Devise {
    /**
     * Convertit un montant de Dollars Canadiens en une autre devise spécifiée.
     *
     * @param devise  la devise cible pour la conversion (Dollar US ou Euro).
     * @param montant le montant en Dollars Canadiens à convertir.
     * @return le montant converti dans la devise cible, ou le montant initial si la devise cible est inconnue.
     */
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