package devslp.designpatterns.abstractfactory.verifone.model3070;

import devslp.designpatterns.abstractfactory.Keyboard;

public class Verifone3070Keyboard implements Keyboard {

    private static Verifone3070Keyboard uniqueInstance;

    private Verifone3070Keyboard() {

    }

    public synchronized static Verifone3070Keyboard getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Verifone3070Keyboard();
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
