package Argent

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class DollarUSTest {
    @Test
    fun dollarUSToEuro() {
        val dollarUS = DollarUS()
        val actual = dollarUS.convertirEn(Euro(), 1.0)
        Assertions.assertEquals(0.9, actual, 0.01)
    }

    @Test
    fun dollarUSToDollarCAN() {
        val dollarUS = DollarUS()
        val actual = dollarUS.convertirEn(DollarCAN(), 1.0)
        Assertions.assertEquals(1.25, actual, 0.01)
    }
}