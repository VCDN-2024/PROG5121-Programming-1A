

package variablesanddatatypes;


public class VariablesAndDataTypes {

  
    public static void main(String[] args) 
    {
      //Numeric Variables
        int age = 1; //Integer Variable
        double salary = 5000.52385349;//Double Variable; holds decimal values
        
        double price = 100;//Double can hold both whole & decimal values
        
        float averageScore = 85.5f;//Small space in memory than the double; 
                //Floating type has to have the 'f' placed after the value
        
        //Numeric Constants
        //You use the keyword final to declare a constant
        final double VAT = 18; //This VAT is fixed at 18
        
        final double TAX = 0.16; //This tax is fixed at 16% & has be declared as a decimal value
        // The percentage symbol is an arithmetic operator & cannot be used as part of the declaration
        
        final int CLASS_SIZE = 30; // set number of people that can fit in a class
        
        String name = ""; //variable that has just been declared with & empty string space
        String lastName = "Govender"; //variable declared with an initialized value
        char grade = 'A'; //character declared with an intiliazed value
        //char response = ''; not allowed to have an empty character space as the intialized value
        
        
        //Boolean Datatype - Used to store only 2 possiblities (true/false)
        //The intialized value is the default position set for the boolean behaviour
        boolean Hulk = false; 
        boolean HulkMad = true;
        
        System.out.println("Is the Hulk Amazing? :" + Hulk);
        System.out.println("Is Hulk Mad? : " + HulkMad);
    }
    
}
