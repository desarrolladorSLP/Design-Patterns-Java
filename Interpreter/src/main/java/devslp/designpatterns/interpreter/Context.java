package devslp.designpatterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Number> symbolTable = new HashMap<>();

    public Context setVariable(String name, Number value) {
        symbolTable.put(name, value);

        return this;
    }

    public Number getVariable(String name) {

        if (!symbolTable.containsKey(name)) {
            throw new UndefinedSymbolException(name);
        }

        return symbolTable.get(name);
    }
}
