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

    //Sichbarkeit
    @Test
    public void testDreieckDreiPositivIstOk() {
        int seite = 10;
        int hoehe = 10;
        testee.dreieck(seite, hoehe);
    }

    //Äquivalenzklassen
    @Test
    public void testSumZweiPositiveIstOk() {
        int value1 = 3;
        int value2 = 21;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumEinPostiveMitNullIstOk() {
        int value1 = 0;
        int value2 = 21;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumEinNegativeUndMinusNullIstOk() {
        int value1 = -54;
        int value2 = -0;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumEinPositiveEinNegativeIstOk() {
        int value1 = -3;
        int value2 = 21;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumZweiNegativeIstOk() {
        int value1 = -3;
        int value2 = -21;
        testee.summe(value1, value2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSumEinPositiveMaxIntIstNotOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 21;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumNullMaxIntIstOk() {
        int value1 = 0;
        int value2 = Integer.MAX_VALUE;
        testee.summe(value1, value2);
    }

    @Test
    public void testSumMaxIntUndMinIntIstOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.summe(value1, value2);
    }

    //Subtraktion
    @Test
    public void testSubZweiPositiveIstOk() {
        int value1 = 3;
        int value2 = 21;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubEinPostiveMitMinusNullIstOk() {
        int value1 = -3;
        int value2 = 21;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubZweiNegativeIsOk() {
        int value1 = -3;
        int value2 = -21;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubEinPostiveMitNullIstOk() {
        int value1 = 0;
        int value2 = 21;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubEinNegativeUndMinusNullIstOk() {
        int value1 = -3;
        int value2 = -0;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSumEinPositiveMaxIntIstOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 21;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubNullMaxIntIstOk() {
        int value1 = 0;
        int value2 = Integer.MAX_VALUE;
        testee.subtraktion(value1, value2);
    }

    @Test
    public void testSubMinIntUndEineNegativeIstOk() {
        int value1 = Integer.MIN_VALUE;
        int value2 = -21;
        testee.subtraktion(value1, value2);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubMaxIntUndMinIntIstNotOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.subtraktion(value1, value2);
    }

    //Division
    @Test
    public void testDivZweiPositiveIstOk() {
        int value1 = 3;
        int value2 = 21;
        testee.division(value1, value2);
    }

    @Test
    public void testDivEinPositiveUndEinNegativeIstOk() {
        int value1 = -3;
        int value2 = 21;
        testee.division(value1, value2);
    }

    @Test
    public void testDivZweiNegativeIstOk() {
        int value1 = -3;
        int value2 = -21;
        testee.division(value1, value2);
    }

    @Test
    public void testDivEinPostiveMitNullIstOk() {
        int value1 = 0;
        int value2 = 37;
        testee.division(value1, value2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivEinNegativeMitMinusNullIstNotOk() {
        int value1 = -3;
        int value2 = -0;
        testee.division(value1, value2);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivZweiNullIstNotOk() {
        int value1 = 0;
        int value2 = 0;
        testee.division(value1, value2);
    }

    @Test
    public void testDivEinPositiveMitMaxIntIstOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = 21;
        testee.division(value1, value2);
    }

    @Test
    public void testDivNullMitMaxIntIstOk() {
        int value1 = 0;
        int value2 = Integer.MAX_VALUE;
        testee.division(value1, value2);
    }

    @Test
    public void testDivMaxIntMitMinIntIstOk() {
        int value1 = Integer.MAX_VALUE;
        int value2 = Integer.MIN_VALUE;
        testee.division(value1, value2);
    }
}


