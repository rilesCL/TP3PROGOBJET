import Temps.CaseHoraire;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Temps.*;
class CaseHoraireTest {

    @Test
    void compareToShouldReturnNegativeWhenLessThan() {
        CaseHoraire ch1 = new CaseHoraire(Jour.LUNDI, 9);
        CaseHoraire ch2 = new CaseHoraire(Jour.LUNDI, 10);
        assertTrue(ch1.compareTo(ch2) < 0, "ch1 devrait être considéré comme moins que ch2");
    }

    @Test
    void compareToShouldReturnPositiveWhenGreaterThan() {
        CaseHoraire ch1 = new CaseHoraire(Jour.MARDI, 11);
        CaseHoraire ch2 = new CaseHoraire(Jour.MARDI, 10);
        assertTrue(ch1.compareTo(ch2) > 0, "ch1 devrait être considéré comme plus grand que ch2");
    }

    @Test
    void compareToShouldReturnZeroWhenEqual() {
        CaseHoraire ch1 = new CaseHoraire(Jour.MERCREDI, 15);
        CaseHoraire ch2 = new CaseHoraire(Jour.MERCREDI, 15);
        assertEquals(0, ch1.compareTo(ch2), "ch1 devrait être considéré comme égal à ch2");
    }
}