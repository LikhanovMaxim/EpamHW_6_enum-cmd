package Cmd;

import org.apache.commons.cli.ParseException;

public class Cmd {
    public static int calculationBinaryOperation(String[] args) {
        int result = 0;
        try {
            Parser parser = new Parser();
            parser.divideBinaryOperation(args);
            Operation operation = new Operation();
            result = operation.getResult(parser.getLeftOperand(), parser.getRightOperand(), parser.getOperation());
        } catch (ParseException e) {
            System.out.println("There are no commands of this type. Please try again.");
            //e.printStackTrace();
        } finally {
            return result;
        }
    }
}
