package devslp.designpatterns.builder.Drinks;

import devslp.designpatterns.builder.Items.Drink;

/**
 * Created by mackaber on 27/03/17.
 */
public class Pepsi extends Drink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public double price() {
        return 13.0;
    }
}
