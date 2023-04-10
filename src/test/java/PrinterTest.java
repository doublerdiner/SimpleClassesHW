import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setup(){
        printer = new Printer(100, 15);
    }

    @Test
    public void hasPaperRemaining(){
        assertEquals(100, printer.getPaperRemaining());
    }

    @Test
    public void hasTonerRemaining(){
        assertEquals(15, printer.getTonerVolume());
    }

    @Test
    public void canPrint() {
        printer.print(2, 5);
        assertEquals(90, printer.getPaperRemaining());
        assertEquals(5, printer.getTonerVolume());
    }

    @Test
    public void cannotPrint(){
        printer.print(10, 5);
        assertEquals(100, printer.getPaperRemaining());
        assertEquals(15, printer.getTonerVolume());
    }

}
