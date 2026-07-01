interface MealPlan {
    void details();
}

class VegetarianMeal implements MealPlan {

    public void details() {
        System.out.println("Vegetarian Meal Plan");
    }
}

class VeganMeal implements MealPlan {

    public void details() {
        System.out.println("Vegan Meal Plan");
    }
}

class KetoMeal implements MealPlan {

    public void details() {
        System.out.println("Keto Meal Plan");
    }
}

class HighProteinMeal implements MealPlan {

    public void details() {
        System.out.println("High Protein Meal Plan");
    }
}

class Meal<T extends MealPlan> {

    private T meal;

    Meal(T meal) {
        this.meal = meal;
    }

    void displayMeal() {
        meal.details();
    }
}

public class MealDemo {

    public static <T extends MealPlan>
    void generateMeal(T meal) {

        System.out.println("Generated Meal:");
        meal.details();
    }

    public static void main(String[] args) {

        Meal<VegetarianMeal> meal =
                new Meal<>(new VegetarianMeal());

        meal.displayMeal();

        generateMeal(new KetoMeal());
    }
}