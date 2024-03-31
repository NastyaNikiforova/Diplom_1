package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {
    private Bun bun = new Bun("black bun", 100);
    @Test
    public void checkGetBunName() {
        Assert.assertEquals("black bun", bun.getName());
    }
    @Test
    public void checkGetBunPrice() {
        Assert.assertEquals(100, bun.getPrice(), 0.01);
    }
}