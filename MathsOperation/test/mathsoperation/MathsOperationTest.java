
package mathsoperation;


import org.junit.Test;
import static org.junit.Assert.*;


public class MathsOperationTest {
    
    @Test
    public void testAdd() {
            
        assertTrue(MathsOperation.add(2, 3) == 5);  
    }

      @Test
    public void testAddInvalid() {
            
        assertFalse(MathsOperation.add(2, 3) == 7);  
    } 
     
    
    
     @Test
    public void testMultiply() {
       
        assertTrue(MathsOperation.multiply(3, 4) == 12);
    }
    
      @Test
    public void testAddAnother() {
    
        assertEquals(5, MathsOperation.add(2, 3));
    }
    
     @Test
    public void testMultiplyAnother() {
     
        assertEquals(12, MathsOperation.multiply(3, 4));
    }
    
      @Test
    public void testAddNumbers() {
        assertTrue(MathsOperation.addNumbers(2, 3));
    }

    
}
