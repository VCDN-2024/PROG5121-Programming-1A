
package basicapp;


public class BasicApp {

   
    public static void main(String[] args) {
         Addition addition = new Addition();
        int resultAdd = addition.add(5, 3);
        int resultSubtract = addition.subtract(5, 3);
        System.out.println("Addition result: " + resultAdd);
        System.out.println("Subtraction result: " + resultSubtract);
    }
    
}
