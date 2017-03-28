package devslp.designpatterns.builder.Items;

import devslp.designpatterns.builder.Packings.Bottle;
import devslp.designpatterns.builder.Packings.Packing;

/**
 * Created by mackaber on 27/03/17.
 */
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
