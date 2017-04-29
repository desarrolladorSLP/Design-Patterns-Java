package devslp.designpatterns.abstractfactory.ingenico.model320;

import devslp.designpatterns.abstractfactory.Display;

public class Ingenico320Display implements Display {

    private static Ingenico320Display uniqueInstance;

    private Ingenico320Display() {

    }

    public synchronized static Ingenico320Display getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new Ingenico320Display();
        }

        return uniqueInstance;
    }

    @Override
    public void printText(int x, int y, int size, String text) {

    }

    @Override
    public void line(int x1, int y1, int x2, int y2) {

    }

    @Override
    public void printIcon(int x, int y, String path) {

    }
}
