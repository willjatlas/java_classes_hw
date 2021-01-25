import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before
    public void before(){
        this.waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.volume);
    }

    @Test
    public void canDrink(){
        assertEquals(waterBottle.volume, waterBottle.drink(20));
    }

}
