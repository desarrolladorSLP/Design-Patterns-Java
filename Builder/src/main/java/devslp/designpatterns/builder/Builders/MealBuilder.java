package devslp.designpatterns.builder.Builders;

import devslp.designpatterns.builder.Meal;

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
