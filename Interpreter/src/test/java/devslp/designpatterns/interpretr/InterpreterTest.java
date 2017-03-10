package devslp.designpatterns.interpretr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import devslp.designpatterns.interpreter.Context;
import devslp.designpatterns.interpreter.Expression;
import devslp.designpatterns.interpreter.MalFormedInputExpression;
import devslp.designpatterns.interpreter.Parser;
import devslp.designpatterns.interpreter.UnexpectedStringException;

public class InterpreterTest {

    @Test
    public void interpretIntegerWellFormedExpression() {
        String inputString = "10 20 2 1 - - +";
        Context context = new Context();

        Expression expression = Parser.getInstance().buildTree(inputString);
        Number result = expression.evaluate(context);

        assertEquals("Evaluation fails", 29.0, result);
    }

    @Test
    public void interpretDoubleWellFormedExpression() {
        String inputString = "2 10.8 20 2 1 - - + *";
        Context context = new Context();

        Expression expression = Parser.getInstance().buildTree(inputString);
        Number result = expression.evaluate(context);

        assertEquals("Evaluation fails", result, 59.6);
    }

    @Test
    public void interpretWellFormedExpressionUsingVariables() {
        String inputString = "var2 var1 2 1 - + *";
        Expression expression = Parser.getInstance().buildTree(inputString);
        Context context;

        context = new Context().setVariable("var1", 1).setVariable("var2", 10);
        assertEquals("Evaluation fails ", 20.0, expression.evaluate(context));

        context = new Context().setVariable("var1", 3).setVariable("var2", 100.5);
        assertEquals("Evaluation fails", 402.0, expression.evaluate(context));

        context = new Context().setVariable("var1", 1000).setVariable("var2", 0);
        assertEquals("Evaluation fails", 0.0, expression.evaluate(context));
    }

    @Test
    public void testingContext() {
        Context context = new Context();

        Parser.getInstance().buildTree("var1 10 5 - =").evaluate(context);
        Parser.getInstance().buildTree("var2 3 5 * var1 + =").evaluate(context);
        Parser.getInstance().buildTree("var3 var1 var2 + =").evaluate(context);

        Number result = Parser.getInstance().buildTree("var3").evaluate(context);
        assertEquals("Evaluation fails", 25.0, result);
    }


    @Test(expected = UnexpectedStringException.class)
    public void interpretDoubleExpressionWithUnknownCharacters() {
        String inputString = "2 10.8 20 2 1 - - + /";
        Context context = new Context();

        Expression expression = Parser.getInstance().buildTree(inputString);
        expression.evaluate(context);
    }


    @Test(expected = MalFormedInputExpression.class)
    public void interpretDoubleBadFormedExpression() {
        String inputString = "2 10.8 20 * 2 1 - - + * ";
        Context context = new Context();

        Expression expression = Parser.getInstance().buildTree(inputString);
        expression.evaluate(context);

    }
}
