package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PerformTest {

    @Test
    public void addGetResult() throws Exception {
        String Perform = "+";
        int leftOperand = 5;
        int rightOperand = -8;
        Perform add = new Perform();
        assertTrue(-3 == add.getResult(leftOperand, rightOperand, Perform));
    }

    @Test
    public void subGetResult() throws Exception {
        String Perform = "-";
        int leftOperand = 5;
        int rightOperand = -8;
        Perform sub = new Perform();
        assertTrue(13 == sub.getResult(leftOperand, rightOperand, Perform));
    }

    @Test
    public void multiGetResult() throws Exception {
        String Perform = "*";
        int leftOperand = 5;
        int rightOperand = -8;
        Perform multi = new Perform();
        assertTrue(-40 == multi.getResult(leftOperand, rightOperand, Perform));
    }

    @Test
    public void divWholeGetResult() throws Exception {
        String Perform = "/";
        int leftOperand = 15;
        int rightOperand = -5;
        Perform multi = new Perform();
        assertTrue(-3 == multi.getResult(leftOperand, rightOperand, Perform));
    }

    @Test
    public void divNoWholeGetResult() throws Exception {
        String Perform = "/";
        int leftOperand = 15;
        int rightOperand = 4;
        Perform multi = new Perform();
        assertTrue(3 == multi.getResult(leftOperand, rightOperand, Perform));
    }

}