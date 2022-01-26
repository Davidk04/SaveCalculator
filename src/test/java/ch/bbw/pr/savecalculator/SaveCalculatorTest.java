package ch.bbw.pr.savecalculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SaveCalculatorTest {

    private SaveCalculator testee;

    @Before
    public void setUp() {
        testee = new SaveCalculator();
    }

    //summe

    @Test
    public void testSumZweiPositiveIsOk() {
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, testee.summe(value1, value2));
    }

    //subtraktion

    @Test
    public void subtraktion() {
        int value1 = 10;
        int value2 = 20;
        assertEquals(testee.subtraktion(value1, value2), -10);
    }

    @Test
    public void testSubZweiNegativeIstOk() {
        int value1 = 10;
        int value2 = 20;
        assertEquals(-10, testee.subtraktion(value1, value2));
    }
}