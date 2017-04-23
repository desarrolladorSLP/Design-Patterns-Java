package devslp.designpatterns.builder.Builders;

import devslp.designpatterns.builder.Burgers.BigMac;
import devslp.designpatterns.builder.Drinks.Coke;
import devslp.designpatterns.builder.Extras.Fries;

// Builder
public class IndividualComboBuilder extends MealBuilder {

    @Override
    public void addBurger() {
        meal.addItem(new BigMac());
    }

    @Override
    public void addDrink() {
        meal.addItem(new Coke());
    }

    @Override
    public void addExtras() {
        meal.addItem(new Fries());
    }
}
