package devslp.designpatterns.factory_method.creator;

import java.util.List;

import devslp.designpatterns.factory_method.Kingdom;
import devslp.designpatterns.factory_method.UserSelection;
import devslp.designpatterns.factory_method.product.World;

public abstract class WorldCreator {

    public World prepareWorld(UserSelection userSelection) {
        World world = getWorld();

        List<Kingdom> kingdomList = userSelection.getKingdoms();

        kingdomList.forEach(kingdom -> world.addKingdom(kingdom));

        world.applyResourcesFactor(userSelection.getResourcesFactor());

        return world;
    }


    protected abstract World getWorld();

}
