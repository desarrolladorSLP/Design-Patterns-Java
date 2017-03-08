package devslp.designpatterns.interpreter;

public class UnexpectedStringException extends RuntimeException {

    UnexpectedStringException(String stringFound) {
        super("Unexpected: " + stringFound);
    }
    
}
