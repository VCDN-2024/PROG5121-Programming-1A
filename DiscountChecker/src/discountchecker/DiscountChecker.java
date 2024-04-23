
package discountchecker;

import java.util.Scanner;
public class DiscountChecker 
{

public static void main(String[] args) 
    {
        int ageLimit = 60;
       boolean isMember = false;
        
         Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
      
        if (age >= ageLimit || isMember) {
            System.out.println("Congratulations! You are eligible for a discount.");
        } else {
            System.out.println("Sorry, you are not eligible for a discount.");
        }

        scanner.close();
    }
    
}
