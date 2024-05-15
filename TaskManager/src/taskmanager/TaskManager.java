

package taskmanager;


import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tasks: ");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        int taskNumber = 0; // Initialize task ID
        while (numTasks > 0) {
            System.out.println("\nTask ID: " + taskNumber);
            System.out.print("Enter task name: ");
            String taskName = scanner.nextLine();
            System.out.print("Enter task details: ");
            String taskDetails = scanner.nextLine();

            // Display task details
            System.out.println("\nTask Details:");
            System.out.println("Task ID: " + taskNumber);
            System.out.println("Task Name: " + taskName);
            System.out.println("Task Details: " + taskDetails);

            
            
            taskNumber++; // Increment task ID for the next task
            numTasks--; // Decrement the number of tasks remaining
        }

        scanner.close();
    }
}

