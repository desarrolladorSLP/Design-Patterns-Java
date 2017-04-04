package devslp.designpatterns.strategy;

public class BitCoinsStrategy implements PaymentStrategy {
    private String wallet;
    private int btc;

    public BitCoinsStrategy(String wallet, int btc) {
        this.wallet = wallet;
        this.btc = btc;
    }

    @Override
    public int pay(int amount) {
        System.out.println("Tranferencia a " + wallet + "de " + btc + "btc");
        return amount;
    }
}
