package devslp.designpatterns.abstractfactory.ingenico;

import devslp.designpatterns.abstractfactory.Display;

public class IngenicoDisplay implements Display {

    private static IngenicoDisplay uniqueInstance;

    private IngenicoDisplay() {

    }

    public synchronized static IngenicoDisplay getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new IngenicoDisplay();
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
