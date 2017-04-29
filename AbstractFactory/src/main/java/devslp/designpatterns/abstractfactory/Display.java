package devslp.designpatterns.abstractfactory;

public interface Display {

    void printText(int x, int y, int size, String text);

    void line(int x1, int y1, int x2, int y2);

    void printIcon(int x, int y, String path);

}
