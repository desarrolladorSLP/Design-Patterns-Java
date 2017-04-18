package devslp.designpatterns.builder.Drinks;

import devslp.designpatterns.builder.Items.Drink;

public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 15.00;
    }
}
