package ch.bbw.pr.savecalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SaveCalculatorTest {

    //summe

    @Test
    public void testSumZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, testee.summe(value1, value2));
    }

    //subtraktion

    @Test
    public void subtraktion() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(testee.subtraktion(value1, value2), -10);
    }

    @Test
    public void testSubZweiNegativeIstOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(-10, testee.subtraktion(value1, value2));
    }
}