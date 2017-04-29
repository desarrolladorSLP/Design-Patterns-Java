package devslp.designpatterns.abstractfactory;

public interface Ethernet {

    void connect(String ip, int port);

    byte []receive(int timeout);

    void write(byte []message);

    void disconnect();

}
