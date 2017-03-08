package devslp.designpatterns.interpreter;

public class NonTerminalExpression_Assignment implements Expression {

    private Expression left;
    private Expression right;

    @Override
    public Number evaluate(Context context) {
        Number result = right.evaluate(context);

        if (!(left instanceof TerminalExpression_Variable))
            throw new LValueRequiredException();

        context.setVariable(((TerminalExpression_Variable) left).getName(), result);

        return result;
    }

    public Expression getLeft() {
        return left;
    }

    public NonTerminalExpression_Assignment setLeft(Expression left) {
        this.left = left;

        return this;
    }

    public Expression getRight() {
        return right;
    }

    public NonTerminalExpression_Assignment setRight(Expression right) {
        this.right = right;

        return this;
    }
}

