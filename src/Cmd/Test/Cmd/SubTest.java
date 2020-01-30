package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SubTest {
    @Test
    public void testCalculation() throws Exception {
        assertTrue(new Sub(2, 3).calculation() == -1);
        assertTrue(new Sub(3, 2).calculation() == 1);
    }

    @Test
    public void zeroCalculation() throws Exception {
        assertTrue(new Sub(0, 3).calculation() == -3);
        assertTrue(new Sub(3, 0).calculation() == 3);
    }

    @Test
    public void differentSignCalculation() throws Exception {
        assertTrue(new Sub(-2, 3).calculation() == -5);
        assertTrue(new Sub(2, -3).calculation() == 5);
    }

    @Test
    public void negativeSignCalculation() throws Exception {
        assertTrue(new Sub(-2, -3).calculation() == 1);
    }
}