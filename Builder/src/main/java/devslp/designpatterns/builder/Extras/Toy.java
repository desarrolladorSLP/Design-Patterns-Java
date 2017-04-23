package devslp.designpatterns.builder.Extras;

import devslp.designpatterns.builder.Items.Item;
import devslp.designpatterns.builder.Packings.Packing;
import devslp.designpatterns.builder.Packings.PlasticBag;

/**
 * Created by mackaber on 27/03/17.
 */
public class Toy implements Item {

    @Override
    public String name() {
        return "Toy";
    }

    @Override
    public Packing packing() {
        return new PlasticBag();
    }

    @Override
    public double price(){
        return 35.0;
    }
}
