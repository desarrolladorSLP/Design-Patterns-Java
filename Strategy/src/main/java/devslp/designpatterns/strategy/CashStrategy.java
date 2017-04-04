package devslp.designpatterns.strategy;

public class CashStrategy implements PaymentStrategy{
    private int cashAmount;

    public CashStrategy(int cashAmount) {

        this.cashAmount = cashAmount;
    }

    @Override
    public int pay(int amount) {
        System.out.println("Pago con efectivo " + cashAmount);
        System.out.println("Pago total: " + amount);
        if(cashAmount >= amount) {
            System.out.print("Cambio: " + (cashAmount - amount));
            return amount;
        }
        else {
            System.out.print("Faltante: " + (amount - cashAmount));
            return cashAmount;
        }
    }
}
