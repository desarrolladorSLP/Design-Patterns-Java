package devslp.designpatterns.builder.Builders;

import devslp.designpatterns.builder.Meal;
import devslp.designpatterns.builder.Packings.Packing;

/**
 * Created by mackaber on 27/03/17.
 */
public abstract class MealBuilder {
    protected Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void createNewMeal() {
        meal = new Meal();
    }

    public abstract void addBurger();

    public abstract void addDrink();

    public abstract void addExtras();

}
