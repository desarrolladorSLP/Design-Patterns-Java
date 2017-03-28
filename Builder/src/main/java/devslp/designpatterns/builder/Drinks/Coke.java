package devslp.designpatterns.builder.Drinks;

import devslp.designpatterns.builder.Items.Drink;

/**
 * Created by mackaber on 27/03/17.
 */
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
