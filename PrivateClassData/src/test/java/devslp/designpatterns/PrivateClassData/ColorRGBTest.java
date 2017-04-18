package devslp.designpatterns.PrivateClassData;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ColorRGBTest {

    @Test
    public void testToCMYK() {
        final ColorRGB color =  new ColorRGB(140, 57, 255);
        final String result = "C=0,451 M=0,776 Y=0,000 K=0,000";

        String message = color.toCMYK();

        assertEquals(result, message);
    }

    @Test
    public void testToHex() {
        final ColorRGB color =  new ColorRGB(250, 140, 25);
        final String result = "#FA8C19";

        String message = color.toHex();

        assertEquals(result, message);
    }
}
