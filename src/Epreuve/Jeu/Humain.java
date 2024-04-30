package Epreuve.Jeu;

public class Humain {
    /**
     * Vérifie si la tentative de l'humain correspond au code secret.
     *
     * @param humain La tentative de l'humain sous forme de chaîne de caractères.
     * @param code Le code secret à deviner.
     * @return Vrai si la tentative correspond au code secret, faux sinon.
     */
    public boolean verifierVictoire(String humain, char[] code) {
        return String.valueOf(code).equals(humain);
    }
    /**
     * Affiche les indices pour le joueur humain après chaque tentative.
     *
     * @param humain La tentative actuelle du joueur humain.
     * @param code Le code secret utilisé pour déterminer les indices.
     */
    public void afficherIndices(String humain, char[] code) {
        StringBuilder indices = new StringBuilder();
        char[] humainArray = humain.toCharArray();


        for (int i = 0; i < code.length; i++) {
            if (humainArray[i] == code[i]) {
                indices.append('\u2022');
            }
        }


        for (char caractereHumain : humainArray) {
            for (char caractereCode : code) {
                if (caractereHumain == caractereCode) {
                    indices.append('\u25CB');
                    break;
                }
            }
        }

        System.out.println("Indices : " + indices.toString());
    }
}
