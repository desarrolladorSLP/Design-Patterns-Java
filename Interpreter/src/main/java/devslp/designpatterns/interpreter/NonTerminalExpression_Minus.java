package devslp.designpatterns.interpreter;

public class NonTerminalExpression_Minus implements Expression {

    private Expression left;
    private Expression right;

    @Override
    public Number evaluate(Context context) {
        return left.evaluate(context).doubleValue() - right.evaluate(context).doubleValue();
    }

    public Expression getLeft() {
        return left;
    }

    public NonTerminalExpression_Minus setLeft(Expression left) {
        this.left = left;

        return this;
    }

    public Expression getRight() {
        return right;
    }

    public NonTerminalExpression_Minus setRight(Expression right) {
        this.right = right;

        return this;
    }
}
