package Cmd;

import org.apache.commons.cli.*;

public class Parser {
    private int leftOperand;
    private int rightOperand;
    private String operation;

    public void divideBinaryOperation(String[] args) throws ParseException {
        if (args == null || args.length == 0) {
            leftOperand = 0;
            rightOperand = 0;
            operation = "+";
            return;
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
        leftOperand = (Integer.parseInt(commandLine.getOptionValue("left_operand")));
        rightOperand = (Integer.parseInt(commandLine.getOptionValue("right_operand")));
        operation = (commandLine.getOptionValue("operation"));
    }

    public String getOperation() {
        return operation;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public int getRightOperand() {
        return rightOperand;
    }
}

