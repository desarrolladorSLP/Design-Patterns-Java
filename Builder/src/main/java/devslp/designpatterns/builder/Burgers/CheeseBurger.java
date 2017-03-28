package devslp.designpatterns.builder.Burgers;

import devslp.designpatterns.builder.Items.Burger;

/**
 * Created by mackaber on 27/03/17.
 */
public class CheeseBurger extends Burger {
    @Override
    public String name() {
        return "CheeseBurger";
    }

    @Override
    public double price() {
        return 15.0;
    }
}
