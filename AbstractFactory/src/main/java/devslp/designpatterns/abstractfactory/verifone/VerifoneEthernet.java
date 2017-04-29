package devslp.designpatterns.abstractfactory.verifone;

import devslp.designpatterns.abstractfactory.Ethernet;

public class VerifoneEthernet implements Ethernet {

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
