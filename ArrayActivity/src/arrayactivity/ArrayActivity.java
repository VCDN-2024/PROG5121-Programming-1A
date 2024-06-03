
package arrayactivity;
   import java.util.Scanner;

public class ArrayActivity {

    public static void main(String[] args) {
         int MAX_FRIENDS = 100;
      
        String[] friends = new String[MAX_FRIENDS];
    
        Scanner scanner = new Scanner(System.in);
        
   
        System.out.println("Enter your friends' names. Enter '1' when finished.");
        
        int count = 0;
        
        while (count < MAX_FRIENDS) {
         
            System.out.print("Friend's name: ");
            String friendName = scanner.nextLine();
            
           
            if (friendName.equalsIgnoreCase("1")) {
                break;
            }
            
            // Add the friend's name to the array
            friends[count] = friendName;
            count++;
        }
        
        scanner.close();
        
  
        System.out.println("\nYour friends are:");
        for (int i = 0; i < count; i++) {
            System.out.println(friends[i]);
        }
    }
}

    

