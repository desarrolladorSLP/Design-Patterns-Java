package devslp.designpatterns.decorator.javaio;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;


public class TestLowerCaseInputStream {
    @Test
    public void testInputFromFile()     {
        int c;

        try {
            InputStream inputStream =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("testInput.txt")));

            String inputString = "";
            while((c = inputStream.read()) >= 0) {
                inputString += c;
            }
            assertEquals(inputString, inputString.toLowerCase());

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Don't know how to test this thing!
    @Test
    public void testInputFromScanner()  {
        InputStream inputStream = new LowerCaseInputStream(System.in);
        Scanner scanner = new Scanner(inputStream);
        String inputLine = scanner.nextLine();
        assertEquals(inputLine, inputLine.toLowerCase());
    }
}
