package devslp.designpatterns.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String number;
    private String cvv;
    private String dateOfExp;

    public CreditCardStrategy(String name, String number, String cvv, String dateOfExp)
    {
        this.name = name;
        this.number = number;
        this.cvv = cvv;
        this.dateOfExp = dateOfExp;
    }

    @Override
    public int pay(int amount) {
        amount *= 1.05;
        System.out.println("Pago con tarjeta de credito.");
        System.out.println("Tc: " + "xxxx-xxxx-xxxx-9999");
        System.out.println("Nombre: " + number);
        System.out.println("Cvv:" + cvv);
        System.out.print("Pago: " + amount);
        return amount;
    }
}
