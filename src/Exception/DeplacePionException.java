package Exception;

public class DeplacePionException extends Exception{
    /**
     * Crée une exception pour un déplacement de pion invalide.
     *
     * @param message Le message qui explique le problème.
     */
    public DeplacePionException(String message){
        super(message);
    }
}
