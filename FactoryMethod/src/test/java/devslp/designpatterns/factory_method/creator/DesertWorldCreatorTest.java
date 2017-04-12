package devslp.designpatterns.factory_method.creator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import devslp.designpatterns.factory_method.product.DesertWorld;
import devslp.designpatterns.factory_method.product.World;

public class DesertWorldCreatorTest extends WorldCreatorTest {

    @Test
    public void usingDesertWorldCreator_WorldMustBeInstanceOfDesertWorld() {
        WorldCreator worldCreator = new DesertWorldCreator();

        World world = worldCreator.prepareWorld(userSelection);

        assertTrue("World must be of type desert", world instanceof DesertWorld);
    }

    @Test
    public void validateDesertWorld_DefaultResources() {
        WorldCreator worldCreator = new DesertWorldCreator();

        World world = worldCreator.prepareWorld(userSelection);

        assertEquals("Trees must be 10", 10, world.getTrees());
        assertEquals("Lakes must be 0", 0, world.getLakes());
        assertEquals("Gold mines must be 3", 3, world.getGoldMines());
        assertEquals("Stone mines must be 10", 10, world.getStoneMines());
    }

    @Test
    public void validateDesertWorld_ResourcesWithFactor2() {
        WorldCreator worldCreator = new DesertWorldCreator();

        userSelection.setResourcesFactor(2);
        World world = worldCreator.prepareWorld(userSelection);

        assertEquals("Trees must be 10*2", 20, world.getTrees());
        assertEquals("Lakes must be 0*2", 0, world.getLakes());
        assertEquals("Gold mines must be 3*2", 6, world.getGoldMines());
        assertEquals("Stone mines must be 10*2", 20, world.getStoneMines());
    }

    @Test
    public void validateDesertWorld_ResourcesWithFactorAHalf() {
        WorldCreator worldCreator = new DesertWorldCreator();

        userSelection.setResourcesFactor(0.5f);
        World world = worldCreator.prepareWorld(userSelection);

        assertEquals("Trees must be 10/2", 5, world.getTrees());
        assertEquals("Lakes must be 0/2", 0, world.getLakes());
        assertEquals("Gold mines must be 3/2", 1, world.getGoldMines());
        assertEquals("Stone mines must be 10/2", 5, world.getStoneMines());
    }

}
