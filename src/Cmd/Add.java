package Cmd;

public class Add implements Operation {
    private int leftOperand;
    private int rightOperand;

    Add(int leftOperand, int rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int calculation() {
        return leftOperand + rightOperand;
    }

    @Override
    public int[] getOperands() {
        return new int[]{leftOperand, rightOperand};
    }

}
