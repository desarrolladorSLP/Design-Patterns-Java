package devslp.designpatterns.builder.Burgers;

import devslp.designpatterns.builder.Items.Burger;

/**
 * Created by mackaber on 27/03/17.
 */
public class BigMac extends Burger {
    @Override
    public String name() {
        return "Big Mac";
    }

    @Override
    public double price() {
        return 20.0;
    }
}
