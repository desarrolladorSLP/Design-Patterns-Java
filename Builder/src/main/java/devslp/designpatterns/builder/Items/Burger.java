package devslp.designpatterns.builder.Items;

import devslp.designpatterns.builder.Packings.Packing;
import devslp.designpatterns.builder.Packings.Wrapper;

/**
 * Created by mackaber on 27/03/17.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}
