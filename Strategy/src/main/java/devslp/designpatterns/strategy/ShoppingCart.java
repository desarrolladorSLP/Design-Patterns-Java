package devslp.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList();
    }

    public void AddItem(Item item) {

        this.items.add(item);
    }

    public int CalculateTotal() {
        int sum = 0;

        for (Item i: items) {
            sum += i.getPrice();
        }
        return sum;
    }

    public int Pay(PaymentStrategy payment) {
        int amount = CalculateTotal();
        amount = payment.pay(amount);
        return amount;
    }
}
