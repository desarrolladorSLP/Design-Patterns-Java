package devslp.designpatterns.decorator.javaio;
import java.io.*;
import java.util.Scanner;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }

    public static void main(String[] args)  {
        InputStream inputStream = new LowerCaseInputStream(System.in);
        Scanner scanner = new Scanner(inputStream);
        String inputLine = scanner.nextLine();
        System.out.println(inputLine);
    }
}