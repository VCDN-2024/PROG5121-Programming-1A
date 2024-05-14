
package arraysumactivity;

import java.util.Scanner;
public class ArraySumActivity 
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Enter 5 integer values:");

        // Input values into the array
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Calculate the sum
        int sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        // Calculate the average
        double average = sum / (double) numbers.length;
               
        // Display the sum
        System.out.println("Sum of the numbers: " + sum);

        // Display the average
        System.out.println("Average of the numbers: " + average);
        
         System.out.println("Enter the value to search for:");
        double searchValue = scanner.nextDouble();

        // Search for the value in the array using enhanced for loop
        boolean found = false;
        
        for (double num : numbers) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }
        
         // Display the result
        if (found) {
            System.out.println("The value " + searchValue + " is found in the array.");
        } else {
            System.out.println("The value " + searchValue + " is not found in the array.");
        }
        
        scanner.close();
    }
}

