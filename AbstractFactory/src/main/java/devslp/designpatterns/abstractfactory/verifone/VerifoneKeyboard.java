package devslp.designpatterns.abstractfactory.verifone;

import devslp.designpatterns.abstractfactory.Keyboard;

public class VerifoneKeyboard implements Keyboard {

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
