package characterexample;
import java.util.Scanner;
public class CharacterExample {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit entered.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter entered.");
        } else if (Character.isWhitespace(ch)) {
            System.out.println(ch + " is a whitespace character.");
        } 
        else {
            System.out.println(ch + " Unknown character");
        }
        
        scanner.close();
    }
    
}
