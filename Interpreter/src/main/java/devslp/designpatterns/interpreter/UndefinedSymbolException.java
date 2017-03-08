package devslp.designpatterns.interpreter;

public class UndefinedSymbolException extends RuntimeException {

    public UndefinedSymbolException(String variableName) {
        super("Undefined symbol: " + variableName);
    }
}
