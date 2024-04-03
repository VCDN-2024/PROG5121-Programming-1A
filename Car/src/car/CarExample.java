
package car;


public class CarExample 
{
    public static void main(String[] args) {
        // Creating a Car object using the parameterized constructor
        Car myCar1 = new Car("Ford", "Mustang", 2024);

        // Displaying information using the displayCarInfo method
        myCar1.displayCarInfo();

        // Creating a Car object using the default constructor
        Car myCar2 = new Car();

        // Displaying information using the displayCarInfo method
        myCar2.displayCarInfo();
    }
}
