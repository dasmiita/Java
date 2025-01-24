// Defining a class
class Car {
    // Properties (variables)
    String brand;
    int year;

    // Method to display details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

// Main class to run the program
public class learningclasses {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Assigning values manually
        myCar.brand = "Toyota";
        myCar.year = 2022;

        // Accessing the method of the object
        myCar.displayInfo();
    }
}
