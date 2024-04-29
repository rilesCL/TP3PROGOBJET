package Argent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EuroTest {

    @Test
    void euroToDollarUS() {
        Euro euro = new Euro();
        double actual = euro.convertirEn(new DollarUS(), 1);
        assertEquals(1.11, actual, 0.01);
    }

    @Test
    void euroToDollarCAN() {
        Euro euro = new Euro();
        double actual = euro.convertirEn(new DollarCAN(), 1);
        assertEquals(1.39, actual, 0.01);
    }
}
