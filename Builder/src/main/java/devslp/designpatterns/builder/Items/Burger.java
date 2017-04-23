package devslp.designpatterns.builder.Items;

import devslp.designpatterns.builder.Packings.Packing;
import devslp.designpatterns.builder.Packings.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract double price();
}
