package devslp.designpatterns.strategy;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StrategyTest {

    @Test
    public void payWithCreditCard() {
        ShoppingCart cart = new ShoppingCart();

        cart.AddItem(new Item("Milk", 15));
        cart.AddItem(new Item("Donuts", 30));
        cart.AddItem(new Item("Duff Beer", 95));

        CreditCardStrategy visa = new CreditCardStrategy(
                "Jesus Lara", "1010-1234-9876-9999", "666", "09-21"
        );

        assertEquals(cart.CalculateTotal(), cart.Pay(visa), 0.0);
    }

    @Test
    public void payWithPayPal() {
        ShoppingCart cart = new ShoppingCart();

        cart.AddItem(new Item("Shampoo", 45));
        cart.AddItem(new Item("Lotion", 80));
        cart.AddItem(new Item("Body Cream", 60));

        PaypalStrategy paypal = new PaypalStrategy("chucho@correo.com", "password5");

        assertEquals(cart.CalculateTotal(), cart.Pay(paypal), 10.0);
    }

    @Test
    public void payWithCash() {
        ShoppingCart cart = new ShoppingCart();

        cart.AddItem(new Item("Coke", 25));
        cart.AddItem(new Item("Chips", 40));

        CashStrategy Cash = new CashStrategy(50);

        assertEquals(cart.CalculateTotal(), cart.Pay(Cash), 0.0);
    }

    @Test
    public void payWithBTC() {
        ShoppingCart cart = new ShoppingCart();

        cart.AddItem(new Item("Bomb", 5));
        cart.AddItem(new Item("Tank", 150));

        BitCoinsStrategy btcS = new BitCoinsStrategy("1BvBMSEYstWetqTFn5Au4m4GFg7xJaNVN2", 155);

        assertEquals(cart.CalculateTotal(), cart.Pay(btcS), 0.0);
    }

    @Test
    public void payWithPoints() {
        ShoppingCart cart = new ShoppingCart();

        cart.AddItem(new Item("Aspirin", 50));

        PointsStrategy points = new PointsStrategy(10);

        assertEquals(cart.CalculateTotal(), cart.Pay(points), 0.0);
    }
}
