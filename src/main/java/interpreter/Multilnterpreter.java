package interpreter;

public class Multilnterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public Multilnterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interprte() {
        return this.firstExpression.interprte() * this.secondExpression.interprte();
    }

    @Override
    public String toString() {
        return "*";
    }
}
