package Epreuve.Jeu;

public class Humain {

    public boolean verifierVictoire(String humain, char[] code) {
        return String.valueOf(code).equals(humain);
    }

    public void afficherIndices(String humain, char[] code) {
        StringBuilder indices = new StringBuilder();
        char[] humainArray = humain.toCharArray();

        // Les points pour les caractères bien placés
        for (int i = 0; i < code.length; i++) {
            if (humainArray[i] == code[i]) {
                indices.append('\u2022'); // Ajoute un point noir pour un caractère bien placé
                humainArray[i] = ' '; // Marque comme traité
                code[i] = ' '; // Prévient la double comptabilisation
            }
        }

        // Les points pour les caractères corrects mais mal placés
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < humainArray.length; j++) {
                if (humainArray[j] == code[i] && humainArray[j] != ' ') {
                    indices.append('\u25CB'); // Ajoute un point blanc pour un caractère mal placé
                    humainArray[j] = ' '; // Marque comme traité
                    break; // Arrête de chercher pour ce caractère
                }
            }
        }

        System.out.println("Indices : " + indices.toString());
    }
}
