package Argent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarCANTest {

    @Test
    void dollarCANToEuro() {
        DollarCAN dollarCAN = new DollarCAN();
        double actual = dollarCAN.convertirEn(new Euro(), 1);
        assertEquals(0.72, actual, 0.01);
    }

    @Test
    void dollarCANToDollarUS() {
        DollarCAN dollarCAN = new DollarCAN();
        double actual = dollarCAN.convertirEn(new DollarUS(), 1);
        assertEquals(0.8, actual, 0.01);
    }
}
