package devslp.designpatterns.abstractfactory.verifone;

import devslp.designpatterns.abstractfactory.CardReader;
import devslp.designpatterns.abstractfactory.Display;
import devslp.designpatterns.abstractfactory.Ethernet;
import devslp.designpatterns.abstractfactory.Keyboard;
import devslp.designpatterns.abstractfactory.Printer;
import devslp.designpatterns.abstractfactory.TerminalIOFactory;

public class VerifoneIO extends TerminalIOFactory {

    private CardReader cardReader;
    private Ethernet ethernet;
    private Printer printer;
    private Display display;
    private Keyboard keyboard;

    public VerifoneIO() {
        cardReader = new VerifoneCardReader();
        display = new VerifoneDisplay();
        ethernet = new VerifoneEthernet();
        keyboard = new VerifoneKeyboard();
        printer = new VerifonePrinter();
    }

    @Override
    public CardReader getCardReader() {
        return cardReader;
    }

    @Override
    public Ethernet getEthernet() {
        return ethernet;
    }

    @Override
    public Printer getPrinter() {
        return printer;
    }

    @Override
    public Display getDisplay() {
        return display;
    }

    @Override
    public Keyboard getKeyboard() {
        return keyboard;
    }
}
