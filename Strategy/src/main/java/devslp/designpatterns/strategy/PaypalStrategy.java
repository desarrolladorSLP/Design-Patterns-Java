package devslp.designpatterns.strategy;

public class PaypalStrategy implements PaymentStrategy {
    private String email;
    private String pass;

    public PaypalStrategy(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    @Override
    public int pay(int amount) {
        amount *= 1.0395;
        System.out.println("Pago con paypal.");
        System.out.println("Usuario: " + email);
        System.out.print("PagoTotal: " + amount);
        return amount;
    }
}
