package devslp.designpatterns.decorator.javaio;

import static org.junit.Assert.assertEquals;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;


public class TestLowerCaseInputStream {

    @Test
    public void testInputFromFile() throws IOException {
        int c;

        InputStream inputStream =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                getClass().getClassLoader().getResourceAsStream("testInput.txt")));

        String inputString = "";
        while ((c = inputStream.read()) >= 0) {
            inputString += (char) c;
        }

        inputStream.close();

        assertEquals(inputString, inputString.toLowerCase());

    }

    @Test
    public void testInputFromScanner() throws IOException {
        InputStream stubInputStream = new ByteArrayInputStream("ALguN MeNSaJe ParA PROBAR".getBytes());
        InputStream inputStream = new LowerCaseInputStream(stubInputStream);

        Scanner scanner = new Scanner(inputStream);

        String inputLine = scanner.nextLine();

        assertEquals(inputLine, inputLine.toLowerCase());
    }
}
