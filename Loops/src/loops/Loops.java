
package loops;


public class Loops {

   
    public static void main(String[] args) {
// Print numbers from 1 to 10
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}

// Calculate the sum of numbers from 1 to 10
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
}
System.out.println("Sum: " + sum);


// Print even numbers from 1 to 10
for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}
        
    }
    
}
