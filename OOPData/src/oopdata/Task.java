
package oopdata;

public class Task {
    
    public void displayDetails(Login login) {
        
        String firstname = login.getFirstname();//This line extracts the value of the firstname property from the login object
        String lastname = login.getLastname();
        
        System.out.println("Firstname: " + firstname);
        System.out.println("Lastname: " + lastname);
        
    }
}
