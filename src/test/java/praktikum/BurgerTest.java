package praktikum;


import org.junit.Assert;
import org.junit.Test;

public class BurgerTest {
    private Burger burger = new Burger();
    Ingredient ingredient;

    @Test
    public void checkAddIngredient() {
        int ingredientsCount = burger.ingredients.size();
        burger.addIngredient(ingredient);
        Assert.assertEquals(ingredientsCount + 1, burger.ingredients.size());
    }
    @Test
    public void checkRemoveIngredient() {
        burger.addIngredient(ingredient);
        int ingredientsCount = burger.ingredients.size();
        burger.removeIngredient(0);
        Assert.assertEquals(ingredientsCount - 1, burger.ingredients.size());
    }
    @Test
    public void checkMoveIngredient() {
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        Ingredient ingredient1 = burger.ingredients.get(1);
        burger.moveIngredient(1, 0);
        Ingredient ingredient2 = burger.ingredients.get(0);
        Assert.assertEquals(ingredient1, ingredient2);
    }
}