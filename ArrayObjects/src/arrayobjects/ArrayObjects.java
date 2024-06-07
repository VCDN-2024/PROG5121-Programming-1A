
package arrayobjects;


public class ArrayObjects {

 
    public static void main(String[] args) {
         // Step 1: Define and instantiate the array
        Person[] people = new Person[3];

        // Step 2: Create objects and assign to array elements
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Step 3: Access and manipulate array elements
        for (Person person : people) {
            person.display();
        }
    }
    
}
