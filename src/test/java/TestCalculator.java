import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before(){
        this.calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(12, calc.add(5,7));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calc.subtract(15, 10));
    }

    @Test
    public void canMultiply(){
        assertEquals(21, calc.multiply(3, 7));
    }

    @Test
    public void canDivide(){
        assertEquals(7.5, calc.divide(15.0, 2.0), 0.01);
    }

}

