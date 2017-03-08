package devslp.designpatterns.interpreter;

public class TerminalExpression_Number implements Expression {
    final private Number number;

    TerminalExpression_Number(Number number) {
        this.number = number;
    }

    @Override
    public Number evaluate(Context context) {
        return number;
    }

    public Number getNumber() {
        return number;
    }
}
