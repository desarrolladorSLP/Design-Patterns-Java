package devslp.designpatterns.abstractfactory;

import java.util.EnumMap;

import devslp.designpatterns.abstractfactory.ingenico.IngenicoIO;
import devslp.designpatterns.abstractfactory.ingenico.model320.Ingenico320IO;
import devslp.designpatterns.abstractfactory.verifone.VerifoneIO;
import devslp.designpatterns.abstractfactory.verifone.model3070.Verifone3070IO;

public abstract class TerminalIOFactory {

    public enum Model {
        VERIFONE,
        INGENICO,
        VERIFONE3070,
        INGENICO320
    }

    private static EnumMap<Model, TerminalIOFactory> factories;

    static {
        factories = new EnumMap<>(Model.class);

        factories.put(Model.VERIFONE, new VerifoneIO());
        factories.put(Model.VERIFONE3070, new Verifone3070IO());

        factories.put(Model.INGENICO, new IngenicoIO());
        factories.put(Model.INGENICO320, new Ingenico320IO());
    }

    static TerminalIOFactory getTerminalIO(Model model) {
        return factories.get(model);
    }

    public abstract CardReader getCardReader();

    public abstract Ethernet getEthernet();

    public abstract Printer getPrinter();

    public abstract Display getDisplay();

    public abstract Keyboard getKeyboard();
}
