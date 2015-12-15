package Cmd;

public class Div implements Operation {
    private int leftOperand;
    private int rightOperand;

    Div(int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        if (rightOperand == 0) {
            assert false : "In class Div, function calculation - division by zero";
            this.rightOperand = 1;
        } else {
            this.rightOperand = rightOperand;
        }
    }

    @Override
    public int calculation() {
        return leftOperand / rightOperand;
    }

    @Override
    public int[] getOperands() {
        return new int[]{leftOperand, rightOperand};
    }
}
