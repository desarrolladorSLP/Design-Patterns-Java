package devslp.designpatterns.builder;

import devslp.designpatterns.builder.Builders.HappyMealBuilder;
import devslp.designpatterns.builder.Builders.IndividualComboBuilder;

import static org.junit.Assert.assertEquals;

import devslp.designpatterns.builder.Items.Burger;
import devslp.designpatterns.builder.Items.Drink;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mackaber on 27/03/17.
 */
public class BuilderTest {

    @Test
    public void individualComboPrice() {
        Employee employee = new Employee();
        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();

        Meal meal = employee.getMeal();
        assertEquals(meal.getTotal(), 50.0, 0);
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
    public void ItemCount() {
        Employee employee = new Employee();
        List<Meal> meals = new ArrayList<>();

        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();
        meals.add(employee.getMeal());

        employee.setMealBuilder(new HappyMealBuilder());
        employee.makeMeal();
        meals.add(employee.getMeal());

        for (Meal meal : meals) {
            assertEquals("Evaluation fails", meal.getItems().size(), 3);
        }
    }

    @Test
    public void ItemOrder() {
        Employee employee = new Employee();
        List<Meal> meals = new ArrayList<>();

        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();
        meals.add(employee.getMeal());

        employee.setMealBuilder(new HappyMealBuilder());
        employee.makeMeal();
        meals.add(employee.getMeal());

        for (Meal meal : meals) {
            assertEquals("Evaluation fails", meal.getItems().get(0).getClass().getSuperclass(), Burger.class);
            assertEquals("Evaluation fails", meal.getItems().get(1).getClass().getSuperclass(), Drink.class);
        }
    }

    @Test
    public void ItemsPacked() {
        Employee employee = new Employee();
        List<Meal> meals = new ArrayList<>();

        employee.setMealBuilder(new IndividualComboBuilder());
        employee.makeMeal();
        meals.add(employee.getMeal());

        employee.setMealBuilder(new HappyMealBuilder());
        employee.makeMeal();
        meals.add(employee.getMeal());

        for(Meal meal : meals) {
            assertEquals("Evaluation fails", meal.getItems().get(0).packing().pack(), "Wrapper");
            assertEquals("Evaluation fails", meal.getItems().get(1).packing().pack(), "Bottle");
        }
    }
}
