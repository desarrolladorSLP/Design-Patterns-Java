package devslp.designpatterns.factory_method.creator;

import devslp.designpatterns.factory_method.product.ForestWorld;
import devslp.designpatterns.factory_method.product.World;

public class ForestWorldCreator extends WorldCreator {

    @Override
    public World getWorld() {
        return new ForestWorld();
    }
}
