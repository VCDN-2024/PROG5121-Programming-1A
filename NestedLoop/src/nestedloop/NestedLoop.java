package nestedloop;
public class NestedLoop {
public static void main(String[] args)
{
 /*
    for (int i = 0; i < 3; i++) 
{
    for (int j = 0; j < 2; j++) 
    {
System.out.println("i: " + i + ", j: " + j);
    }
}
*/
    
       
    

for (int i = 1; i <= 5; i++)
 {
       for (int j = 1; j <= 5; j++) 
{
System.out.print(i * j + "\t ");
}
System.out.println();
}

}

}
