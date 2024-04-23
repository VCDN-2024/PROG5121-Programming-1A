
package loopperformance;


public class LoopPerformance {

   
    public static void main(String[] args) {
      int n = 1000000;
        long startTime, endTime;
        
        // Using prefix increment (++i)
        startTime = System.nanoTime();
        int sumPrefix = sumWithPrefixIncrement(n);
        endTime = System.nanoTime();
        System.out.println("Sum with prefix increment: " + sumPrefix);
        System.out.println("Time taken with prefix increment: " + (endTime - startTime) + " ns");
        
        // Using postfix increment (i++)
        startTime = System.nanoTime();
        int sumPostfix = sumWithPostfixIncrement(n);
        endTime = System.nanoTime();
        System.out.println("Sum with postfix increment: " + sumPostfix);
        System.out.println("Time taken with postfix increment: " + (endTime - startTime) + " ns");
    }
    
    public static int sumWithPrefixIncrement(int n) {
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += i;
        }
        return sum;
    }
    
    public static int sumWithPostfixIncrement(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
   
}

