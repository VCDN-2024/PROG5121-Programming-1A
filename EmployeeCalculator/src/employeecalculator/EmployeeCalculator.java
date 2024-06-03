
package employeecalculator;


import java.util.Scanner;

public class EmployeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of employees: ");
        int maxEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] names = new String[maxEmployees];
        double[] hourlyWages = new double[maxEmployees];
        double[] hoursWorked = new double[maxEmployees];
        int employeeCount = 0;

        while (true) {
            System.out.print("Enter employee's name (type 'exit' to finish): ");
            String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter " + name + "'s hourly wage: ");
            double hourlyWage = scanner.nextDouble();

            System.out.print("Enter " + name + "'s hours worked: ");
            double hours = scanner.nextDouble();
            
            // Consume the newline character left by nextDouble()
            scanner.nextLine();

            names[employeeCount] = name;
            hourlyWages[employeeCount] = hourlyWage;
            hoursWorked[employeeCount] = hours;
            employeeCount++;
        }

        System.out.println("\nEmployee Gross Pay:");
        for (int i = 0; i < employeeCount; i++) {
            double grossPay = calculateGrossPay(hourlyWages[i], hoursWorked[i]);
            System.out.println(names[i] + ": $" + String.format("%.2f", grossPay));
        }

        scanner.close();
    }

    public static double calculateGrossPay(double hourlyWage, double hoursWorked) {
        return hourlyWage * hoursWorked;
    }
}

