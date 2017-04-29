package devslp.designpatterns.abstractfactory;

public interface Printer {

    void printLine(int size, int alignment, String text);

    void lineFeed();

    void printIcon(int alignment, String path);

}
