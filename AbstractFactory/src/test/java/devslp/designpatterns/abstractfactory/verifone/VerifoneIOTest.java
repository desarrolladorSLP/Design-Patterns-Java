package devslp.designpatterns.abstractfactory.verifone;

import static junit.framework.TestCase.assertTrue;

import org.junit.Before;
import org.junit.Test;

import devslp.designpatterns.abstractfactory.CardReader;
import devslp.designpatterns.abstractfactory.Display;
import devslp.designpatterns.abstractfactory.Ethernet;
import devslp.designpatterns.abstractfactory.Keyboard;
import devslp.designpatterns.abstractfactory.Printer;
import devslp.designpatterns.abstractfactory.TerminalIOFactory;

public class VerifoneIOTest {

    private TerminalIOFactory terminalIOFactory;

    @Before
    public void setup() {
        terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.VERIFONE);
    }

    @Test
    public void getCardReaderTest() {
        CardReader cardReader = terminalIOFactory.getCardReader();

        assertTrue(cardReader instanceof VerifoneCardReader);
    }

    @Test
    public void getEthernetTest() {
        Ethernet ethernet = terminalIOFactory.getEthernet();

        assertTrue(ethernet instanceof VerifoneEthernet);
    }

    @Test
    public void getPrinterTest() {
        Printer printer = terminalIOFactory.getPrinter();

        assertTrue(printer instanceof VerifonePrinter);
    }

    @Test
    public void getDisplayTest() {
        Display display = terminalIOFactory.getDisplay();

        assertTrue(display instanceof VerifoneDisplay);
    }

    @Test
    public void getKeyboardTest() {
        Keyboard keyboard = terminalIOFactory.getKeyboard();

        assertTrue(keyboard instanceof VerifoneKeyboard);
    }
}
