package devslp.designpatterns.factory_method.creator;

import devslp.designpatterns.factory_method.product.DesertWorld;
import devslp.designpatterns.factory_method.product.World;

public class DesertWorldCreator extends WorldCreator {

    @Override
    public World getWorld() {
        return new DesertWorld();
    }
}
