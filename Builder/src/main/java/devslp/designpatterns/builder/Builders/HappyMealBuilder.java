package devslp.designpatterns.builder.Builders;

import devslp.designpatterns.builder.Burgers.CheeseBurger;
import devslp.designpatterns.builder.Drinks.Pepsi;
import devslp.designpatterns.builder.Extras.Toy;

// Builder
public class HappyMealBuilder extends MealBuilder {

    @Override
    public void addBurger() {
        meal.addItem(new CheeseBurger());
    }

    @Override
    public void addDrink() {
        meal.addItem(new Pepsi());
    }

    @Override
    public void addExtras() {
        meal.addItem(new Toy());
    }
}
