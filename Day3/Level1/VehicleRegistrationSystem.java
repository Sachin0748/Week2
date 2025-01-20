// Class representing a Vehicle in the registration system
class Vehicle {
  // Static variable shared by all vehicles (registration fee)
  static double registrationFee = 5000.00;

  // Instance variables unique to each vehicle
  private String ownerName;
  private String vehicleType;
  private final String registrationNumber; // Final variable to ensure registration number cannot be changed

  // Constructor to initialize vehicle details using 'this' keyword
  Vehicle(String ownerName, String vehicleType, String registrationNumber) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
    this.registrationNumber = registrationNumber;
  }

  // Static method to update the registration fee
  static void updateRegistrationFee(double newFee) {
    registrationFee = newFee;
  }

  // Method to display vehicle registration details
  void displayRegistrationDetails() {
    System.out.println("Owner Name          : " + ownerName);
    System.out.println("Vehicle Type        : " + vehicleType);
    System.out.println("Registration Number : " + registrationNumber);
    System.out.println("Registration Fee    : " + registrationFee + "\n");
  }
}

// Main class to manage the vehicle registration system
public class VehicleRegistrationSystem {
  public static void main(String[] args) {
    System.out.println("\nRegistering vehicles......\n");

    // Creating vehicle objects
    Vehicle vehicle1 = new Vehicle("Sachin", "Car", "ABC123");
    Vehicle vehicle2 = new Vehicle("Duggu", "Bike", "XYZ789");

    // Checking if vehicle1 is an instance of Vehicle class before processing
    if (vehicle1 instanceof Vehicle) {
      vehicle1.displayRegistrationDetails();
    } else {
      System.out.println("vehicle1 is not an instance of Vehicle class.");
    }

    // Checking if vehicle2 is an instance of Vehicle class before processing
    if (vehicle2 instanceof Vehicle) {
      vehicle2.displayRegistrationDetails();
    } else {
      System.out.println("vehicle2 is not an instance of Vehicle class.");
    }

    // Updating the registration fee
    Vehicle.updateRegistrationFee(6000.00);
    System.out.println("After updating registration fee....\n");

    // Display updated registration details
    vehicle1.displayRegistrationDetails();
    vehicle2.displayRegistrationDetails();
  }
}
