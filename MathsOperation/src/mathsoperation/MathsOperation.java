
package mathsoperation;
public class MathsOperation {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
      
    public static boolean addNumbers(int a, int b) {
        int result = a + b;
        return true;    
    }
    
    public static void main(String[] args) {
       
       System.out.println("Testing add method:");
       System.out.println("2 + 3 = " + add(2, 3));
        
       
       System.out.println("\nTesting multiply method:");
       System.out.println("3 * 4 = " + multiply(3, 4));
        
       System.out.println("\nTesting addNumbers method:");
       System.out.println("3 + 4 = " + addNumbers(3, 4));
        
    }
    
}
