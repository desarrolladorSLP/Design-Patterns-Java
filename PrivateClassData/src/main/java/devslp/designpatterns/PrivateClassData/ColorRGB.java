package devslp.designpatterns.PrivateClassData;

public class ColorRGB {
    private ColorRGBData data;

    public ColorRGB(int r, int g, int b) {
        this.data = new ColorRGBData(r, g, b);
    }

    public String toCMYK() {
        float black = Math.min(Math.min(255f - data.getRed(),
                255f - data.getGreen()), 255f - data.getBlue());

        if(black != 255f) {
            float cyan = (255f - data.getRed() - black) / (255f - black);
            float magenta = (255f - data.getGreen() - black) / (255f - black);
            float yellow = (255f - data.getBlue() - black) / (255f - black);

            return String.format("C=%.3f M=%.3f Y=%.3f K=%.3f", cyan, magenta, yellow, black);
        }
        else {
            float cyan = 255f - data.getRed();
            float magenta = 255f - data.getGreen();
            float yellow = 255f - data.getBlue();

            return String.format("C=%.3f M=%.3f Y=%.3f K=%.3f", cyan, magenta, yellow, black);
        }
    }

    public String toHex() {
        return String.format("#%02X%02X%02X", data.getRed(), data.getGreen(), data.getBlue());
    }

}
