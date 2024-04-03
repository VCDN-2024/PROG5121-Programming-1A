package car;
public class Car {
    // Attributes
    String make;
    String model;
    int year;
    
    // Constructor with parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        //this is a keyword that refers to the current instance of the class.
    }
    // Default constructor
    public Car() {
         // Default values or setup logic can be added here
        this.make = "Unknown Make";
        this.model = "Unknown Model";
        this.year = 0;
    }
      // Method to display car information
    public void displayCarInfo() {
        System.out.println("Car Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    // Other methods and code for the Car class
}

