
package ifstatements;

import java.util.Scanner;
public class IfStatements {

  // Method to check if the input number is equal to 7
    public static void checkNumber(int inputNumber) {
        if(inputNumber == 7) {
            System.out.println("This is my lucky number 7");
        } else {
            System.out.println("This number is unknown to me");
        }
    }
    
     // Method to check if age is eligible
    public static void checkAge(int inputNumber) {
        if(inputNumber >= 18) {
            System.out.println("You are eligible");
            System.out.println("Welcome to the club...");
        } else {
            System.out.println("Sorry you are not eligible.");
            System.out.println("Go to Funtubbles");          
        }
    }
    
    // Method to check eligibility based on gender and age
    public static void checkEligibility(String gender, Scanner scanner) {
       
        if (gender.equals("male")) 
        {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) 
        {
        System.out.println("You are eligible for access.");
        } else {
        System.out.println("You are not eligible for access.");
        }
        } 
        
        else {
        System.out.println("You are not eligible for access.");
        }
    }
    public static void main(String[] args) {       
        Scanner scanner = new Scanner(System.in);
                
         System.out.print("Enter a number... ");//Activity 1
        int inputNumber = scanner.nextInt();
          scanner.nextLine(); // Consume newline character- do this if the system acts up
        checkNumber(inputNumber);
        
         
        System.out.print("Please enter your age: ");//Activity 2
        int userAge = scanner.nextInt();
          scanner.nextLine(); // Consume newline character
        checkAge(userAge);
        
        System.out.print("Are you male or female? (Type 'male' or 'female'): ");//Activity 3
        String gender = scanner.nextLine();

        checkEligibility(gender, scanner);
        
        scanner.close();
    }
    
}
