package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class IngredientTest {

    private final Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "sour cream", 200);
    @Test
    public void getPrice() {
    Assert.assertEquals(200, ingredient.getPrice(), 0.01);
    }

    @Test
    public void getName() {
    Assert.assertEquals("sour cream", ingredient.getName());
    }

    @Test
    public void getType() {
    Assert.assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}