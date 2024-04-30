package Exception;

public class AjoutParticipantException extends Exception {
    /**
     * Construit une nouvelle AjoutParticipantException avec le message d'erreur spécifié.
     *
     * @param message Le message détaillant la raison de l'exception, typiquement expliquant
     *                que le nombre maximal de participants a été atteint.
     */
    public AjoutParticipantException(String message){
        super(message);
    }
}
