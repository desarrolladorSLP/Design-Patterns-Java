package devslp.designpatterns.abstractfactory.ingenico;

import devslp.designpatterns.abstractfactory.CardReader;
import devslp.designpatterns.abstractfactory.Display;
import devslp.designpatterns.abstractfactory.Ethernet;
import devslp.designpatterns.abstractfactory.Keyboard;
import devslp.designpatterns.abstractfactory.Printer;
import devslp.designpatterns.abstractfactory.TerminalIOFactory;

public class IngenicoIO extends TerminalIOFactory {

    @Override
    public synchronized CardReader getCardReader() {
        return IngenicoCardReader.getInstance();
    }

    @Override
    public synchronized Ethernet getEthernet() {
        return IngenicoEthernet.getInstance();
    }

    @Override
    public synchronized Printer getPrinter() {
        return IngenicoPrinter.getInstance();
    }

    @Override
    public synchronized Display getDisplay() {
        return IngenicoDisplay.getInstance();
    }

    @Override
    public synchronized Keyboard getKeyboard() {
        return IngenicoKeyboard.getInstance();
    }
}
