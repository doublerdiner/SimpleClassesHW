import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(15, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(99, calculator.multiply(11, 9));
    }

    @Test
    public void canDivideWholeNumbers(){
        assertEquals(3, calculator.divide(12, 4), 0.01);
//        assertEquals(2.5, calculator.divide(10, 4));
    }
    @Test
    public void canDivideDoubleNumbers(){
//        assertEquals(3, calculator.divide(12, 4));
        assertEquals(2.5, calculator.divide(10, 4), 0.01);
    }


}
