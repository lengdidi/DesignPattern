package interpreter;

public class AddInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interprte() {
        return this.firstExpression.interprte() + this.secondExpression.interprte();
    }

    @Override
    public String toString() {
        return "+";
    }
}
