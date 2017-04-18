package devslp.designpatterns.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import devslp.designpatterns.builder.Builders.IndividualComboBuilder;
import devslp.designpatterns.builder.Items.Burger;
import devslp.designpatterns.builder.Items.Drink;
import devslp.designpatterns.builder.Items.Item;

public class IndividualComboBuilderTest {

    @Test
    public void individualComboPrice() {
        Employee employee = new Employee();
        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();

        Meal meal = employee.getMeal();
        assertEquals(meal.getTotal(), 50.0, 0);
    }

    @Test
    public void IndividualComboBuilderShouldHave3Items() {
        Employee employee = new Employee();
        List<Item> items;

        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();

        items = employee.getMeal().getItems();

        assertEquals("Must have 3 items", 3, items.size());

        assertTrue("First item must be a burger", items.get(0) instanceof Burger);
        assertTrue("Second item must be a drink", items.get(1) instanceof Drink);
        assertFalse("Third item must not be a burger", items.get(2) instanceof Burger);
        assertFalse("Third item must not be a drink", items.get(2) instanceof Drink);
    }


    @Test
    public void IndividualComboBuilderPackagingValidation() {
        Employee employee = new Employee();

        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();

        List<Item> items = employee.getMeal().getItems();

        assertEquals("Must have 3 items", 3, items.size());

        assertEquals("First item package should be Wrapper", "Wrapper", items.get(0).packing().pack());
        assertEquals("Second item package should be bottle", "Bottle", items.get(1).packing().pack());
        assertEquals("Third item package should be ", "Cardboard", items.get(2).packing().pack());
    }
}
