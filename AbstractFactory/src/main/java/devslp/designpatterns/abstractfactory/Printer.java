package devslp.designpatterns.abstractfactory;

public interface Printer {

    void printLine(int ems, int alignment, String text);

    void lineFeed();

    void printIcon(int alignment, String path);

}
