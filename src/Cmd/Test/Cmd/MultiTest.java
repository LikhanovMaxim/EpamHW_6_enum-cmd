package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MultiTest {

    @Test
    public void testCalculation() throws Exception {
        assertTrue(new Multi(2, 3).calculation() == 6);
        assertTrue(new Multi(3, 2).calculation() == 6);
    }

    @Test
    public void zeroCalculation() throws Exception {
        assertTrue(new Multi(0, 3).calculation() == 0);
        assertTrue(new Multi(3, 0).calculation() == 0);
    }

    @Test
    public void unitCalculation() throws Exception {
        assertTrue(new Multi(1, 3).calculation() == 3);
        assertTrue(new Multi(3, 1).calculation() == 3);
    }

    @Test
    public void differentSignCalculation() throws Exception {
        assertTrue(new Multi(-2, 3).calculation() == -6);
        assertTrue(new Multi(2, -3).calculation() == -6);
    }

    @Test
    public void negativeSignCalculation() throws Exception {
        assertTrue(new Multi(-2, -3).calculation() == 6);
    }
}