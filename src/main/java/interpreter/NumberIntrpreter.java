package interpreter;

public class NumberIntrpreter implements Interpreter {
    private int number;

    public NumberIntrpreter(int number) {
        this.number = number;
    }

    public NumberIntrpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interprte() {
        return this.number;
    }
}
