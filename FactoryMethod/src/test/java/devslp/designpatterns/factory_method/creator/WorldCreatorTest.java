package devslp.designpatterns.factory_method.creator;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import devslp.designpatterns.factory_method.Kingdom;
import devslp.designpatterns.factory_method.UserSelection;
import devslp.designpatterns.factory_method.product.World;

public class WorldCreatorTest {
    UserSelection userSelection;

    @Before
    public void setup() {
        userSelection = new UserSelection();

        List<Kingdom> kingdomList = new LinkedList<>();
        Kingdom kingdom;

        kingdom = new Kingdom();
        kingdom.setColor("red");
        kingdom.setName("kingdom-1");

        kingdomList.add(kingdom);

        kingdom = new Kingdom();
        kingdom.setColor("blue");
        kingdom.setName("kingdom-2");

        kingdomList.add(kingdom);

        kingdom = new Kingdom();
        kingdom.setColor("green");
        kingdom.setName("kingdom-3");

        kingdomList.add(kingdom);

        userSelection.setKingdoms(kingdomList);
        userSelection.setSpeed(1);
        userSelection.setResourcesFactor(1);
    }

    @Test
    public void testCreationProcess() {
        WorldCreator worldCreator = Mockito.spy(WorldCreator.class);
        World world = mock(World.class);

        Mockito.when(worldCreator.getWorld()).thenReturn(world);

        World retrievedWorld = worldCreator.prepareWorld(userSelection);

        userSelection.getKingdoms().forEach(kingdom -> verify(world).addKingdom(kingdom));

        verify(world, times(1)).applyResourcesFactor(userSelection.getResourcesFactor());

        assertTrue(retrievedWorld == world);

        verifyNoMoreInteractions(world);
    }


}
