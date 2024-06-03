
package basicapp;


import org.junit.Test;
import static org.junit.Assert.*;


public class AdditionTest {
    
  
    @Test
    public void testAdd() {
        Addition addition = new Addition();
        assertEquals(-5, addition.add(-8, 3));
    }
    
    @Test
    public void testSubtract() {
        Addition addition = new Addition();
        assertEquals(-11, addition.subtract(-8, 3));
    }
}
