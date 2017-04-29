package devslp.designpatterns.abstractfactory.ingenico;

import devslp.designpatterns.abstractfactory.Ethernet;

public class IngenicoEthernet implements Ethernet {

    private static IngenicoEthernet uniqueInstance;

    private IngenicoEthernet() {

    }

    public synchronized static IngenicoEthernet getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new IngenicoEthernet();
        }

        return uniqueInstance;
    }

    @Override
    public void connect(String ip, int port) {

    }

    @Override
    public byte[] receive(int timeout) {
        return new byte[0];
    }

    @Override
    public void write(byte[] message) {

    }

    @Override
    public void disconnect() {

    }
}
