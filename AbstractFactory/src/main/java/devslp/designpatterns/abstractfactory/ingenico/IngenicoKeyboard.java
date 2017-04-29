package devslp.designpatterns.abstractfactory.ingenico;

import devslp.designpatterns.abstractfactory.Keyboard;

public class IngenicoKeyboard implements Keyboard {

    private static IngenicoKeyboard uniqueInstance;

    private IngenicoKeyboard() {

    }

    public synchronized static IngenicoKeyboard getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new IngenicoKeyboard();
        }

        return uniqueInstance;
    }

    @Override
    public char[] getKey() {
        return new char[0];
    }

    @Override
    public boolean isKeyPressed() {
        return false;
    }

    @Override
    public boolean isKeyPressed(char c) {
        return false;
    }
}
