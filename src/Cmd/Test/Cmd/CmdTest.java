package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CmdTest {

    @Test
    public void addCmd() throws Exception {
        String[] args = {"-l", "27", "-r", "4", "-o", "+"};
        assertTrue(31 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void subCmd() throws Exception {
        String[] args = {"-l", "27", "-r", "4", "-o", "-"};
        assertTrue(23 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void multiCmd() throws Exception {
        String[] args = {"-l", "2", "-r", "4", "-o", "*"};
        assertTrue(8 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void divWholeCmd() throws Exception {
        String[] args = {"-l", "-28", "-r", "4", "-o", "/"};
        assertTrue(-7 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void divNoWholeCmd() throws Exception {
        String[] args = {"-l", "-29", "-r", "4", "-o", "/"};
        assertTrue(-7 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void wrongLeftOperandCmd() throws Exception {
        String[] args = {"-", "-29", "-r", "4", "-o", "/"};
        assertTrue(0 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void wrongRightOperandCmd() throws Exception {
        String[] args = {"-l", "-29", "-r", "ads", "-o", "/"};
        assertTrue(0 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void wrongOperationOperandCmd() throws Exception {
        String[] args = {"-l", "-29", "-r", "4", "-o", "4"};
        assertTrue(0 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void emptyArgsCmd() throws Exception {
        String[] args = {};
        assertTrue(0 == Cmd.calculationBinaryOperation(args));
    }

    @Test
    public void nullArgsCmd() throws Exception {
        String[] args = null;
        assertTrue(0 == Cmd.calculationBinaryOperation(args));
    }
}