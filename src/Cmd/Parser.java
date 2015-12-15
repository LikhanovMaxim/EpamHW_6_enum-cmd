package Cmd;

import org.apache.commons.cli.*;

public class Parser {
    private Operation operation;

    public void divideBinaryOperation(String[] args) throws ParseException {
        if (args == null || args.length == 0) {
            assert false : "Wrong args in function 'divideBinaryOperation'";
        }
        Options options = new Options();
        options.addOption(OptionBuilder.
                withLongOpt("left_operand").
                isRequired().
                withType(PatternOptionBuilder.NUMBER_VALUE).
                hasArg().
                withDescription("left operand").
                withArgName("leftOperand").
                create("l"));
        options.addOption(OptionBuilder.
                withLongOpt("right_operand").
                isRequired().
                withType(PatternOptionBuilder.NUMBER_VALUE).
                hasArg().
                withDescription("right operand").
                withArgName("rightOperand").
                create("r"));
        options.addOption(OptionBuilder.
                withLongOpt("operation").
                isRequired().
                withType(PatternOptionBuilder.NUMBER_VALUE).
                hasArg().
                withDescription("operation").
                withArgName("operation").
                create("o"));
        CommandLineParser commandLineParser = new PosixParser();
        CommandLine commandLine = commandLineParser.parse(options, args);
        int leftOperand, rightOperand;
        leftOperand = (Integer.parseInt(commandLine.getOptionValue("left_operand")));
        rightOperand = (Integer.parseInt(commandLine.getOptionValue("right_operand")));
        switch ((commandLine.getOptionValue("operation"))) {
            case "+": {
                operation = new Add(leftOperand, rightOperand);
                break;
            }
            case "-": {
                operation = new Sub(leftOperand, rightOperand);
                break;
            }
            case "*": {
                operation = new Multi(leftOperand, rightOperand);
                break;
            }
            case "/": {
                operation = new Div(leftOperand, rightOperand);
                break;
            }
        }
    }

    public Operation getOperation() {
        return operation;
    }

}

