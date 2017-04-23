package devslp.designpatterns.factory_method.creator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import devslp.designpatterns.factory_method.product.ForestWorld;
import devslp.designpatterns.factory_method.product.World;

public class ForestWorldCreatorTest extends WorldCreatorTest {
    @Test
    public void usingForestWorldCreator_WorldMustBeInstanceOfForestWorld() {
        WorldCreator worldCreator = new ForestWorldCreator();

        World world = worldCreator.prepareWorld(userSelection);

        assertTrue("World must be of type forest", world instanceof ForestWorld);
    }

    @Test
    public void validateForestWorld_DefaultResources() {
        WorldCreator worldCreator = new ForestWorldCreator();

        World world = worldCreator.prepareWorld(userSelection);

        assertEquals("Trees must be 100", 100, world.getTrees());
        assertEquals("Lakes must be 2", 2, world.getLakes());
        assertEquals("Gold mines must be 10", 10, world.getGoldMines());
        assertEquals("Stone mines must be 10", 10, world.getStoneMines());
    }

    @Test
    public void validateForestWorld_ResourcesWithFactor2() {
        WorldCreator worldCreator = new ForestWorldCreator();

        userSelection.setResourcesFactor(2);
        World world = worldCreator.prepareWorld(userSelection);

        assertEquals("Trees must be 100*2", 200, world.getTrees());
        assertEquals("Lakes must be 2*2", 4, world.getLakes());
        assertEquals("Gold mines must be 10*2", 20, world.getGoldMines());
        assertEquals("Stone mines must be 10*2", 20, world.getStoneMines());
    }

    @Test
    public void validateForestWorld_ResourcesWithFactorAHalf() {
        WorldCreator worldCreator = new ForestWorldCreator();

        userSelection.setResourcesFactor(0.5f);
        World world = worldCreator.prepareWorld(userSelection);

        assertEquals("Trees must be 100/2", 50, world.getTrees());
        assertEquals("Lakes must be 2/2", 1, world.getLakes());
        assertEquals("Gold mines must be 10/2", 5, world.getGoldMines());
        assertEquals("Stone mines must be 10/2", 5, world.getStoneMines());
    }
}
