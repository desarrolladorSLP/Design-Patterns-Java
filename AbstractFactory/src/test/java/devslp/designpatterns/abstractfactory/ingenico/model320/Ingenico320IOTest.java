package devslp.designpatterns.abstractfactory.ingenico.model320;

import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

import devslp.designpatterns.abstractfactory.Display;
import devslp.designpatterns.abstractfactory.Printer;
import devslp.designpatterns.abstractfactory.TerminalIOFactory;

public class Ingenico320IOTest {

    private TerminalIOFactory terminalIOFactory;

    @Before
    public void setup() {
        terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.INGENICO320);
    }

    @Test
    public void getPrinterTest() {
        Printer printer = terminalIOFactory.getPrinter();

        assertTrue(printer instanceof Ingenico320Printer);
    }

    @Test
    public void getDisplayTest() {
        Display display = terminalIOFactory.getDisplay();

        assertTrue(display instanceof Ingenico320Display);
    }

}
