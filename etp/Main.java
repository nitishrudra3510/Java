package etp;
// Class definition
class Car {
    // Fields
    String make;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Creating an object of the class Car
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // Creating an instance of the Car class
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;
        myCar.displayDetails(); // Calling a method on the object
    }
}
