package Cmd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ParserTest {

    @Test
    public void addParser() throws Exception {
        String[] args = {"-l", "27", "-r", "4", "-o", "+"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        Operation operation = parser.getOperation();
        Operation resultOperation = new Add(27, 4);
        assertTrue(resultOperation.getClass() == operation.getClass());
        assertTrue(Arrays.equals(new int[]{27, 4}, operation.getOperands()));
    }

    @Test
    public void subParser() throws Exception {
        String[] args = {"-l", "-27", "-r", "4", "-o", "-"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        Operation operation = parser.getOperation();
        Operation resultOperation = new Sub(-27, 4);
        assertTrue(resultOperation.getClass() == operation.getClass());
        assertTrue(Arrays.equals(new int[]{-27, 4}, operation.getOperands()));
    }

    @Test
    public void multiParser() throws Exception {
        String[] args = {"-l", "-27", "-r", "4", "-o", "*"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        Operation operation = parser.getOperation();
        Operation resultOperation = new Multi(-27, 4);
        assertTrue(resultOperation.getClass() == operation.getClass());
        assertTrue(Arrays.equals(new int[]{-27, 4}, operation.getOperands()));
    }

    @Test
    public void divParser() throws Exception {
        String[] args = {"-l", "-27", "-r", "4", "-o", "/"};
        Parser parser = new Parser();
        parser.divideBinaryOperation(args);
        Operation operation = parser.getOperation();
        Operation resultOperation = new Div(-27, 4);
        assertTrue(resultOperation.getClass() == operation.getClass());
        assertTrue(Arrays.equals(new int[]{-27, 4}, operation.getOperands()));
    }

//    @Test
//    public void wrongLeftOperandParser() throws Exception {
////        try Exception
//    }
//
//    @Test
//    public void wrongRightOperandParser() throws Exception {
////        try Exception
//    }
//
//    @Test
//    public void wrongOperationOperandParser() throws Exception {
////        try Exception
//    }

//    @Test
//    public void emptyArgsParser() throws Exception {
//       //assert
//    }

//    @Test
//    public void nullArgsParser() throws Exception {
//        assert
//    }
}