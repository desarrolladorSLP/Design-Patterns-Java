package devslp.designpatterns.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import devslp.designpatterns.builder.Builders.HappyMealBuilder;
import devslp.designpatterns.builder.Items.Burger;
import devslp.designpatterns.builder.Items.Drink;
import devslp.designpatterns.builder.Items.Item;

public class HappyMealBuilderTest {

    @Test
    public void HappyMealBuilderShouldHave3Items() {
        Employee employee = new Employee();
        List<Item> items;

        employee.setMealBuilder(new HappyMealBuilder());
        employee.makeMeal();
        items = employee.getMeal().getItems();

        assertEquals("Must have 3 items", 3, items.size());

        assertTrue("First item must be a burger", items.get(0) instanceof Burger);
        assertTrue("Second item must be a drink", items.get(1) instanceof Drink);
        assertFalse("Third item must not be a burger", items.get(2) instanceof Burger);
        assertFalse("Third item must not be a drink", items.get(2) instanceof Drink);
    }

    @Test
    public void happyMealPrice() {
        Employee employee = new Employee();
        employee.setMealBuilder(new HappyMealBuilder());
        employee.makeMeal();

        Meal meal = employee.getMeal();
        assertEquals(meal.getTotal(), 63.0, 0);
    }

    @Test
    public void HappyMealBuilderPackagingValidation() {
        Employee employee = new Employee();

        employee.setMealBuilder(new HappyMealBuilder());
        employee.makeMeal();

        List<Item> items = employee.getMeal().getItems();

        assertEquals("Must have 3 items", 3, items.size());

        assertEquals("First item package should be Wrapper", "Wrapper", items.get(0).packing().pack());
        assertEquals("Second item package should be bottle", "Bottle", items.get(1).packing().pack());
        assertEquals("Third item package should be ", "Plastic Bag", items.get(2).packing().pack());
    }
}
