
package oopdata;


public class Login {
      private String username;
    private String password;
    private String firstname;
    private String lastname;
    
    // Constructor
    public Login(String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    // Method to get firstname
    public String getFirstname() {
        return firstname;
    }
    
    // Method to get lastname
    public String getLastname() {
        return lastname;
    }
}
