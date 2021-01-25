import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before() {
        this.printer = new Printer(200, 100,
                                    100, 30);
    }

    @Test
    public void canAddLessThanMaxPaper(){
        assertEquals(0, printer.addPaper(10));
    }

    @Test
    public void canReturnUnusedPaper(){
        assertEquals(30, printer.addPaper(100));
    }

    @Test
    public void canPrint(){
        assertEquals(15, printer.print(3, 5));
    }

    @Test
    public void canNotPrint(){
        assertEquals(0, printer.print(5, 10));
    }

}
