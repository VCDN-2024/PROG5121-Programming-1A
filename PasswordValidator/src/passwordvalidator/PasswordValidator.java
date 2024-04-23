
package passwordvalidator;
public class PasswordValidator {

 
    public static void main(String[] args) {
     // Create a PasswordValidator instance with the desired validation rules
        PasswordValidator validator = new PasswordValidatorBuilder()
                .setLength(8, 30) // Minimum and maximum length
                .setRequireUppercase(true) // Require at least one uppercase letter
                .setRequireLowercase(true) // Require at least one lowercase letter
                .setRequireDigit(true) // Require at least one digit
                .setRequireSpecialChar(true) // Require at least one special character
                .build();

        // Validate a password
        String password = "MyPassword123!";
        boolean isValid = validator.validate(password);

        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
    
}
