package devslp.designpatterns.builder.Items;

import devslp.designpatterns.builder.Packings.Packing;

public interface Item {
    String name();

    Packing packing();

    double price();
}
