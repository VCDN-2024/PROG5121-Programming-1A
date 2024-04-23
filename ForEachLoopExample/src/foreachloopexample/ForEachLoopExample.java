
package foreachloopexample;


public class ForEachLoopExample {
    public static void main(String[] args) {
        // Example 1: Iterating over an array using for-each loop
        
        // Array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Printing each element of the array
        System.out.println("Array elements using for-each loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for clarity
    }
}
