
package evennumberchecker;

import java.util.Scanner;

public class EvenNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput;
        
        // Prompt the user to type an even number or the sentinel value
        System.out.println("Enter an even number or 999 to stop: ");
         
        // Continue looping until the user types the sentinel value 999
        while (true) {
            userInput = scanner.nextInt();
            
            // Check if the user input is the sentinel value 999
            if (userInput == 999) {
                System.out.println("Program stopped.");
                break;  // End the program if the sentinel value is entered
            }
            
            // Check if the user input is even
            if (userInput % 2 == 0) {
                System.out.println("Good job!");
            } else {
                // Display an error message for odd numbers
                System.out.println("Error: Please enter an even number.");
            }
            
            // Prompt the user for another input
            System.out.println("Enter an even number or 999 to stop: ");
        }
        
        scanner.close();
    }
}

