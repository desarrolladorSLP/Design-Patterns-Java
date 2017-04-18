package devslp.designpatterns.builder;

import devslp.designpatterns.builder.Builders.MealBuilder;

// Director
public class Employee {
    private MealBuilder mealBuilder;

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void makeMeal() {
        mealBuilder.createNewMeal();

        mealBuilder.addBurger();
        mealBuilder.addDrink();
        mealBuilder.addExtras();
    }
}
