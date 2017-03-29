package devslp.designpatterns.singleton;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Random;

/**
 *
 * @author Enrique Guardiola
 */
public class LoggerTest {
    public static void main(String[] args) {
        MessageLoop m1=new MessageLoop("***Grady Booch");
        MessageLoop m2=new MessageLoop("+++James Rumbaugh");
        MessageLoop m3=new MessageLoop("---Ivar Jacobson");
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Logger {
    private static Logger instance;
    private Logger(){
    }
    public static synchronized Logger getInstance(){
        if(instance == null)
            instance = new Logger();
        return instance;
    }
    public synchronized void loggerString(String str){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("logFile.txt",true), StandardCharsets.UTF_8))) {
            writer.write(str);
        } 
        catch (IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }  
    }
}
class MessageLoop implements Runnable {
    String name;
    public MessageLoop(String name){
        this.name = name;
    }
    public void run() {
        Random rand = new Random();
        long rgenseed = System.currentTimeMillis();
        rand.setSeed(rgenseed);
        try {
            while(true){
                Thread.sleep(rand.nextInt(500));
                Logger.getInstance().loggerString(name + " says hi\r\n");
            }
        } catch (InterruptedException e) {
            Logger.getInstance().loggerString("Exception caugth: " + e.getMessage());
        }
    }
}