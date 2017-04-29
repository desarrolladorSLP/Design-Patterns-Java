package devslp.designpatterns.abstractfactory.example;

import devslp.designpatterns.abstractfactory.CardReader;
import devslp.designpatterns.abstractfactory.Display;
import devslp.designpatterns.abstractfactory.Ethernet;
import devslp.designpatterns.abstractfactory.Keyboard;
import devslp.designpatterns.abstractfactory.Printer;
import devslp.designpatterns.abstractfactory.TerminalIOFactory;

public class AbstractFactoryExample {

    private TerminalIOFactory terminalIOFactory;

    public AbstractFactoryExample() {
        terminalIOFactory = TerminalIOFactory.getTerminalIO(TerminalIOFactory.Model.VERIFONE);
    }

    public void cardReader_example() {

        CardReader cardReader = terminalIOFactory.getCardReader();

        cardReader.enable();

        String track = cardReader.read();

        System.out.println(track);

        cardReader.disable();

    }

    public void display_example() {
        Display display = terminalIOFactory.getDisplay();

        display.printText(4, 0, 1, "00:00");
        display.printIcon(70, 0, "/resources/batery.ico");
        display.printText(78, 0, 1, "100%");

        display.printText(50, 3, 1, "    SALE");
        display.printText(50, 13, 1, "RE-PRINT");
        display.printText(50, 23, 1, "  REFUND");
        display.printText(50, 33, 1, "   AVOID");
    }

    public void ethernet_example() {
        Ethernet ethernet = terminalIOFactory.getEthernet();

        ethernet.connect("172.95.21.10", 5051);

        ethernet.write("some message".getBytes());

        byte[] response = ethernet.receive(45000);

        System.out.println("Bytes received: " + response.length);

        ethernet.disconnect();
    }

    public void keyboard_example(){
        Keyboard keyboard = terminalIOFactory.getKeyboard();

        if(keyboard.isKeyPressed('S')){
            System.out.printf("Start sale");
        }
    }

    public void print_example() {

        Printer printer = terminalIOFactory.getPrinter();

        printer.printLine(2, 0, "DesarrolladorSLP");
        printer.lineFeed();
        printer.printIcon(0, "/resources/desarrolladorSLP.ico");
        printer.lineFeed();

        printer.printLine(1, -1, "Date");
        printer.printLine(1, 1, "Time");
        printer.lineFeed();

        printer.printLine(1, 0, "_______________");
        printer.lineFeed();
        printer.printLine(1, 0, "Thank you");
        printer.lineFeed();
    }


}
