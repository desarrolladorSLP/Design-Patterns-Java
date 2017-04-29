package devslp.designpatterns.abstractfactory.ingenico;

import devslp.designpatterns.abstractfactory.Printer;

public class IngenicoPrinter implements Printer {

    private static IngenicoPrinter uniqueInstance;

    private IngenicoPrinter() {

    }

    public synchronized static IngenicoPrinter getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new IngenicoPrinter();
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
