package devslp.designpatterns.abstractfactory.ingenico.model320;

import devslp.designpatterns.abstractfactory.Printer;

public class Ingenico320Printer implements Printer {

    private static Ingenico320Printer uniqueInstance;

    private Ingenico320Printer() {

    }

    public synchronized static Ingenico320Printer getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Ingenico320Printer();
        }

        return uniqueInstance;
    }

    @Override
    public void printLine(int size, int alignment, String text) {

    }

    @Override
    public void lineFeed() {

    }

    @Override
    public void printIcon(int alignment, String path) {

    }
}
