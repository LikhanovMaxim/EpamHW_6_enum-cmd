package Cmd;

import org.apache.commons.cli.ParseException;

public class Cmd {
    public static int calculationBinaryOperation(String[] args) {
        int result = 0;
        try {
            Parser parser = new Parser();
            parser.divideBinaryOperation(args);
            Perform perform = new Perform();
            result = perform.getResult(parser.getLeftOperand(), parser.getRightOperand(), parser.getOperation());
        } catch (ParseException e) {
            System.out.println("'" + args + "' no commands of this type. See '--help'.");
            //e.printStackTrace();
        } finally {
            return result;
        }
    }
}
