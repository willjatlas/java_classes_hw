import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {

    WaterBottle waterBottle;

    @Before
    public void before(){
        this.waterBottle = new WaterBottle(100, 70);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.volume);
    }

    @Test
    public void hasCurWater(){
        assertEquals(70, waterBottle.curWater);
    }

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(60, waterBottle.curWater);
    }

    @Test
    public void canEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.curWater);
    }

    @Test
    public void canFill(){
        waterBottle.fill();
        assertEquals(100, waterBottle.curWater);
    }

}
