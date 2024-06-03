/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package book;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BookTest {
    
   @Test
    public void testIsTitleValid() {
        // Test with a valid title
        Book validBook = new Book("Valid Title", "Author", 2024);
        assertTrue(validBook.isTitleValid(), "Title should be valid");

  
    }
    
     @Test
    public void testIsTitleInValid() {
     // Test with more than 20 characters
        Book invalidBook = new Book("This title is way too long", "Author", 2024);
        assertFalse(invalidBook.isTitleValid(), "Title should be invalid");
        
    }
    
         @Test
    public void testmore() {
     // Test with exactly 20 characters
       Book exactly20CharsBook = new Book("Exactly Twenty Chars", "Author", 2024);
        assertTrue(exactly20CharsBook.isTitleValid(), "Title with exactly 20 characters should be valid");

    }
    
    }
    

