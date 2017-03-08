package devslp.designpatterns.interpreter;

public class TerminalExpression_Variable implements Expression {
    private final String name;

    TerminalExpression_Variable(String name) {
        this.name = name;
    }

    @Override
    public Number evaluate(Context context) {
        return context.getVariable(name);
    }

    public String getName() {
        return name;
    }


}
