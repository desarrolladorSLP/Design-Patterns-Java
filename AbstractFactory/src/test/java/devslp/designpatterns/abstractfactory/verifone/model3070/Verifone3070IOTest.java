package devslp.designpatterns.abstractfactory.verifone.model3070;

import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

import devslp.designpatterns.abstractfactory.Keyboard;
import devslp.designpatterns.abstractfactory.TerminalIOFactory;

public class Verifone3070IOTest {

    private TerminalIOFactory terminalIOFactory;

    @Before
    public void setup() {
        terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.VERIFONE3070);
    }

    @Test
    public void getKeyboardTest() {
        Keyboard keyboard = terminalIOFactory.getKeyboard();

        assertTrue(keyboard instanceof Verifone3070Keyboard);
    }

}
