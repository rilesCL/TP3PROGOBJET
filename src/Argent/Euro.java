package Argent;

import Argent.Devise;
import Argent.DollarUS;

// Classe Argent.Euro
public class Euro extends Devise {
    /**
     * Convertit un montant d'Euros en une autre devise spécifiée.
     *
     * @param devise  la devise cible pour la conversion (Dollar US ou Dollar Canadien).
     * @param montant le montant en Euros à convertir.
     * @return le montant converti dans la devise cible, ou le montant initial si la devise cible est inconnue.
     */
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