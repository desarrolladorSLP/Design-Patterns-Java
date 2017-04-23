package devslp.designpatterns.builder.Burgers;

import devslp.designpatterns.builder.Items.Burger;

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
