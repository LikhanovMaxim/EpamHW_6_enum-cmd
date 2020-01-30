package Cmd;

public class Perform {
    private int add(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

    private int sub(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

    private int multi(int leftOperand, int rightOperand) {
        return leftOperand * rightOperand;
    }

    private int dif(int leftOperand, int rightOperand) {
        return leftOperand / rightOperand;
    }

    public int getResult(int leftOperand, int rightOperand, String operation) {
        switch (operation) {
            case "+": {
                return add(leftOperand, rightOperand);
            }
            case "-": {
                return sub(leftOperand, rightOperand);
            }
            case "*": {
                return multi(leftOperand, rightOperand);
            }
            case "/": {
                return dif(leftOperand, rightOperand);
            }
        }
        assert false : "wrong operation";
        return 0;
    }
}

