package ch.bbw.pr.savecalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SaveCalculatorTest {

    @Test
    public void testSumZweiPositiveIsOk() {
        SaveCalculator testee = new SaveCalculator();
        int value1 = 10;
        int value2 = 20;
        assertEquals(30, testee.summe(value1, value2));
    }
}