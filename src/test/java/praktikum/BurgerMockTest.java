package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BurgerMockTest {
    private Burger burger = new Burger();
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;

    @Test
    public void checkGetPrice() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(50.9F);
        Mockito.when(ingredient.getPrice()).thenReturn(200F);
        Assert.assertEquals(501.8F, burger.getPrice(), 0);
    }
    @Test
    public void checkGetReceipt() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(bun.getPrice()).thenReturn(50F);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient.getName()).thenReturn("cutlet");
        Mockito.when(ingredient.getPrice()).thenReturn(200F);


        String expectedReceipt = String.format("(==== black bun ====)" + System.lineSeparator() +
                "= filling cutlet =" + System.lineSeparator() +
                "(==== black bun ====)" + System.lineSeparator() +
                "" + System.lineSeparator() +
                "Price: 300,000000" + System.lineSeparator());
        Assert.assertEquals(expectedReceipt, burger.getReceipt());
    }
}

