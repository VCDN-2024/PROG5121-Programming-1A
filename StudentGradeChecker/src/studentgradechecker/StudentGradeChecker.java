
package studentgradechecker;

import java.util.Scanner;
public class StudentGradeChecker {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your exam score: ");
       int examScore = scanner.nextInt();

       
        String grade="";

        if (examScore >= 75 && examScore <= 100) {
            grade = "Distinction";
        } else if (examScore >= 50 && examScore <= 74) {
            grade = "Passed";
        } else if (examScore >= 40 && examScore <= 49) {
            grade = "Supplementary";
        } else if (examScore >= 0 && examScore <= 39) {
            grade ="Failed";
        }
         
        else {
            System.out.println("Invalid score! Please enter a score between 0 and 100.");
        }

     
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
    
}
