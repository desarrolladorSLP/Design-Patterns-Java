package devslp.designpatterns.builder;

import devslp.designpatterns.builder.Builders.MealBuilder;

/**
 * Created by mackaber on 27/03/17.
 */

// Director
public class Employee {
    private MealBuilder mealBuilder;

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void makeMeal(){
        mealBuilder.createNewMeal();
        mealBuilder.addBurger();
        mealBuilder.addDrink();
        mealBuilder.addExtras();
    }
}
