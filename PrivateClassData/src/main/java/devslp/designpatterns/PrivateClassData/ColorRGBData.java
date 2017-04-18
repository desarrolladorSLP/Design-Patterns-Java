package devslp.designpatterns.PrivateClassData;

public class ColorRGBData {
    private int red;
    private int green;
    private int blue;

    public ColorRGBData(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

}
