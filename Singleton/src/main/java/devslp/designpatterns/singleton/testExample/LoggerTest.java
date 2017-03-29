package devslp.designpatterns.singleton.testExample;

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


