package Cmd;

import org.apache.commons.cli.ParseException;

public class Cmd {
    public static int calculationBinaryOperation(String[] args) {
        int result = 0;
        try {
            Parser parser = new Parser();
            parser.divideBinaryOperation(args);
            Operation operation = parser.getOperation();
            result = operation.calculation();
        } catch (ParseException e) {
            System.out.println("'" + args + "' no commands of this type. See '--help'.");
        } finally {
            return result;
        }
    }
}
