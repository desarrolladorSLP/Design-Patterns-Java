package devslp.designpatterns.interpreter;

import java.util.Deque;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Parser {

    private static Parser parser;

    private static final String PLUS_SYMBOL = "+";
    private static final String MINUS_SYMBOL = "-";
    private static final String MULTIPLY_SYMBOL = "*";
    private static final String ASSIGN_SYMBOL = "=";

    public Expression buildTree(String s) {
        Deque<Expression> parseTree = new LinkedList<>();
        String[] tokens = s.split(" ", -1);
        Expression expression;

        try {
            for (String token : tokens) {
                if (token.equals(PLUS_SYMBOL)) {
                    expression = new NonTerminalExpression_Plus()
                            .setRight(parseTree.pop())
                            .setLeft(parseTree.pop());
                    parseTree.push(expression);
                } else if (token.equals(MINUS_SYMBOL)) {
                    expression = new NonTerminalExpression_Minus()
                            .setRight(parseTree.pop())
                            .setLeft(parseTree.pop());
                    parseTree.push(expression);
                } else if (token.equals(MULTIPLY_SYMBOL)) {
                    expression = new NonTerminalExpression_Multiply()
                            .setRight(parseTree.pop())
                            .setLeft(parseTree.pop());
                    parseTree.push(expression);
                } else if (token.equals(ASSIGN_SYMBOL)) {
                    expression = new NonTerminalExpression_Assignment()
                            .setRight(parseTree.pop())
                            .setLeft(parseTree.pop());
                    parseTree.push(expression);
                } else if (token.matches("\\d*\\.\\d+")) {
                    parseTree.push(new TerminalExpression_Number(Double.valueOf(token)));
                } else if (token.matches("\\d+")) {
                    parseTree.push(new TerminalExpression_Number(Integer.valueOf(token)));
                } else if (token.matches("[a-zA-Z\\d_]+")) {
                    parseTree.push(new TerminalExpression_Variable(token));
                } else {
                    throw new UnexpectedStringException(token);
                }
            }
        } catch (EmptyStackException | NoSuchElementException ex) {
            throw new MalFormedInputExpression(ex);
        }

        if (parseTree.size() != 1) {
            throw new MalFormedInputExpression();
        }

        return parseTree.pop();
    }

    public static synchronized Parser getInstance() {
        if (parser == null) {
            parser = new Parser();
        }

        return parser;
    }
}
