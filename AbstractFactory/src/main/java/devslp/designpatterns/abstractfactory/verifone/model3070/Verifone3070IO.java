package devslp.designpatterns.abstractfactory.verifone.model3070;

import devslp.designpatterns.abstractfactory.Keyboard;
import devslp.designpatterns.abstractfactory.verifone.VerifoneIO;

public class Verifone3070IO extends VerifoneIO {

    public Keyboard getKeyboard() {
        return Verifone3070Keyboard.getInstance();
    }
}
