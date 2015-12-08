package Cmd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void addParser() throws Exception {
        String[] args = {"-l", "27", "-r", "4", "-o", "+"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        int leftOperandResult = 27;
        int rightOperandResult = 4;
        String operationResult = "+";
        assertTrue(operationResult.equals(parser.getOperation()));
        assertTrue(leftOperandResult == parser.getLeftOperand());
        assertTrue(rightOperandResult == parser.getRightOperand());
    }

    @Test
    public void subParser() throws Exception {
        String[] args = {"-l", "-27", "-r", "4", "-o", "-"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        int leftOperandResult = -27;
        int rightOperandResult = 4;
        String operationResult = "-";
        assertTrue(operationResult.equals(parser.getOperation()));
        assertTrue(leftOperandResult == parser.getLeftOperand());
        assertTrue(rightOperandResult == parser.getRightOperand());
    }

    @Test
    public void multiParser() throws Exception {
        String[] args = {"-l", "-27", "-r", "4", "-o", "*"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        int leftOperandResult = -27;
        int rightOperandResult = 4;
        String operationResult = "*";
        assertTrue(operationResult.equals(parser.getOperation()));
        assertTrue(leftOperandResult == parser.getLeftOperand());
        assertTrue(rightOperandResult == parser.getRightOperand());
    }

    @Test
    public void divParser() throws Exception {
        String[] args = {"-l", "-27", "-r", "4", "-o", "/"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        int leftOperandResult = -27;
        int rightOperandResult = 4;
        String operationResult = "/";
        assertTrue(operationResult.equals(parser.getOperation()));
        assertTrue(leftOperandResult == parser.getLeftOperand());
        assertTrue(rightOperandResult == parser.getRightOperand());
    }

    @Test
    public void wrongLeftOperandParser() throws Exception {
//        try Exception
    }

    @Test
    public void wrongRightOperandParser() throws Exception {
//        try Exception
    }

    @Test
    public void wrongOperationOperandParser() throws Exception {
//        try Exception
    }

    @Test
    public void emptyArgsParser() throws Exception {
        String[] args = {};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        int leftOperandResult = 0;
        int rightOperandResult = 0;
        String operationResult = "+";
        assertTrue(operationResult.equals(parser.getOperation()));
        assertTrue(leftOperandResult == parser.getLeftOperand());
        assertTrue(rightOperandResult == parser.getRightOperand());
    }

    @Test
    public void nullArgsParser() throws Exception {
        String[] args = null;
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        int leftOperandResult = 0;
        int rightOperandResult = 0;
        String operationResult = "+";
        assertTrue(operationResult.equals(parser.getOperation()));
        assertTrue(leftOperandResult == parser.getLeftOperand());
        assertTrue(rightOperandResult == parser.getRightOperand());
    }
}