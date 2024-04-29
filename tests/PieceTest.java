import Epreuve.Jeu.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTest {

    @Test
    void corrigerPositionShouldCorrectHorizontalLeft() {
        Piece piece = new Piece('A', 5);
        piece.deplace(-2, 0); // Déplacement vers la gauche hors du plateau
        assertEquals('A', piece.getXpos(), "La position horizontale devrait être corrigée à 'A'");
        assertEquals(5, piece.getYpos(), "La position verticale devrait rester à 5");
    }

    @Test
    void corrigerPositionShouldCorrectHorizontalRight() {
        Piece piece = new Piece('H', 5);
        piece.deplace(2, 0); // Déplacement vers la droite hors du plateau
        assertEquals('H', piece.getXpos(), "La position horizontale devrait être corrigée à 'H'");
        assertEquals(5, piece.getYpos(), "La position verticale devrait rester à 5");
    }

    @Test
    void corrigerPositionShouldCorrectVerticalBottom() {
        Piece piece = new Piece('D', 1);
        piece.deplace(0, -2); // Déplacement vers le bas hors du plateau
        assertEquals('D', piece.getXpos(), "La position horizontale devrait rester à 'D'");
        assertEquals(1, piece.getYpos(), "La position verticale devrait être corrigée à 1");
    }

    @Test
    void corrigerPositionShouldCorrectVerticalTop() {
        Piece piece = new Piece('D', 8);
        piece.deplace(0, 2); // Déplacement vers le haut hors du plateau
        assertEquals('D', piece.getXpos(), "La position horizontale devrait rester à 'D'");
        assertEquals(8, piece.getYpos(), "La position verticale devrait être corrigée à 8");
    }
}
