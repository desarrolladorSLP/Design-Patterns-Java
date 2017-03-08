package devslp.designpatterns.interpreter;

public class MalFormedInputExpression extends RuntimeException {

    MalFormedInputExpression() {

    }

    MalFormedInputExpression(Throwable cause) {
        super(cause);
    }

}