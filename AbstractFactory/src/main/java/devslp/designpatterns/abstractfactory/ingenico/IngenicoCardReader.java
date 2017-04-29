package devslp.designpatterns.abstractfactory.ingenico;

import devslp.designpatterns.abstractfactory.CardReader;

public class IngenicoCardReader implements CardReader {

    private static IngenicoCardReader uniqueInstance;

    private IngenicoCardReader() {

    }

    public synchronized static IngenicoCardReader getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new IngenicoCardReader();
        }

        return uniqueInstance;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public String read() {
        return null;
    }
}
