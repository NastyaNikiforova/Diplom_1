package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private final IngredientType type;
    public IngredientTypeTest(IngredientType type) {
        this.type = type;
    }
    @Parameterized.Parameters
    public static Object[][] getIngredientType() {
        return new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING},
        };
    }

    @Test
    public void checkIngredientType() {
        assertThat(type.toString(), anyOf(is("SAUCE"), is("FILLING")));
    }


}