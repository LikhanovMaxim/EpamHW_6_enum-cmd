package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class OperationTest {

    @Test
    public void addGetResult() throws Exception {
        String operation = "+";
        int leftOperand = 5;
        int rightOperand = -8;
        Operation add = new Operation();
        assertTrue(-3 == add.getResult(leftOperand, rightOperand, operation));
    }

    @Test
    public void subGetResult() throws Exception {
        String operation = "-";
        int leftOperand = 5;
        int rightOperand = -8;
        Operation sub = new Operation();
        assertTrue(13 == sub.getResult(leftOperand, rightOperand, operation));
    }

    @Test
    public void multiGetResult() throws Exception {
        String operation = "*";
        int leftOperand = 5;
        int rightOperand = -8;
        Operation multi = new Operation();
        assertTrue(-40 == multi.getResult(leftOperand, rightOperand, operation));
    }

    @Test
    public void divWholeGetResult() throws Exception {
        String operation = "/";
        int leftOperand = 15;
        int rightOperand = -5;
        Operation multi = new Operation();
        assertTrue(-3 == multi.getResult(leftOperand, rightOperand, operation));
    }

    @Test
    public void divNoWholeGetResult() throws Exception {
        String operation = "/";
        int leftOperand = 15;
        int rightOperand = 4;
        Operation multi = new Operation();
        assertTrue(3 == multi.getResult(leftOperand, rightOperand, operation));
    }

}