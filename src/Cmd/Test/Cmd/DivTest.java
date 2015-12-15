package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DivTest {
    @Test
    public void testCalculation() throws Exception {
        assertTrue(new Div(5, 2).calculation() == 2);
        assertTrue(new Div(6, 2).calculation() == 3);
    }

    @Test
    public void zeroCalculation() throws Exception {
        assertTrue(new Div(0, 3).calculation() == 0);
//        assertTrue(new Div(3, 0).calculation() == 0); assert
    }

    @Test
    public void unitCalculation() throws Exception {
        assertTrue(new Div(1, 3).calculation() == 0);
        assertTrue(new Div(3, 1).calculation() == 3);
    }

    @Test
    public void differentSignCalculation() throws Exception {
        assertTrue(new Div(-5, 3).calculation() == -1);
        assertTrue(new Div(6, -3).calculation() == -2);
    }

    @Test
    public void negativeSignCalculation() throws Exception {
        assertTrue(new Div(-9, -3).calculation() == 3);
    }
}