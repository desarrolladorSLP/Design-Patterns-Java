package devslp.designpatterns.builder.Items;

import devslp.designpatterns.builder.Packings.Packing;

/**
 * Created by mackaber on 27/03/17.
 */
public interface Item {
    String name();
    Packing packing();
    double price();
}
