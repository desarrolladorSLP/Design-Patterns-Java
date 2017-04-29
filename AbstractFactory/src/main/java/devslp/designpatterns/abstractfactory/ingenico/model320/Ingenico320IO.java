package devslp.designpatterns.abstractfactory.ingenico.model320;

import devslp.designpatterns.abstractfactory.Display;
import devslp.designpatterns.abstractfactory.Printer;
import devslp.designpatterns.abstractfactory.ingenico.IngenicoIO;

public class Ingenico320IO extends IngenicoIO {

    @Override
    public Printer getPrinter() {
        return Ingenico320Printer.getInstance();
    }

    @Override
    public Display getDisplay() {
        return Ingenico320Display.getInstance();
    }
}
