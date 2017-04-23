package devslp.designpatterns.builder.Items;

import devslp.designpatterns.builder.Packings.Bottle;
import devslp.designpatterns.builder.Packings.Packing;

public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract double price();
}
