
package oopdata;


public class OOPData {

   
     public static void main(String[] args) {
        // Creating an instance of Login
        Login login = new Login("username", "password", "John", "Doe");
        
        // Creating an instance of Task
        Task task = new Task();
        
        // Calling the displayDetails method of Task class
        task.displayDetails(login);
    }
    
}
