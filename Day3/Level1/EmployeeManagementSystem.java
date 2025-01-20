// Class representing an Employee
class Employee {
  // Static variable shared among all Employee objects (common company name)
  static String companyName = "Capgemini";

  // Private instance variables unique to each employee
  private String name;
  private final int id; // Final variable (cannot be changed once assigned)
  private String designation;

  // Static variable to track the total number of employees (shared among all
  // objects)
  static int totalEmployee = 0;

  // Constructor to initialize employee details and increment totalEmployee count
  Employee(String name, int id, String designation) {
    this.name = name;
    this.id = id;
    this.designation = designation;
    totalEmployee++; // Increment total employees when a new object is created
  }

  // Static method to display the total number of employees
  static void displayTotalEmployees() {
    System.out.println("Total Employee is : " + totalEmployee);
  }

  // Instance method to display employee details
  void displayDetails() {
    System.out.println("Name of employee is        : " + name);
    System.out.println("ID of employee is          : " + id);
    System.out.println("Designation of employee is : " + designation + "\n");
  }
}

// Main class to manage employees
public class EmployeeManagementSystem {
  public static void main(String[] args) {
    System.out.println("\nShowing details of Employees......\n");
    System.out.println("Company name is : " + Employee.companyName + "\n");
    // Creating first employee object
    Employee employee1 = new Employee("Sachin", 149, "Developer");

    // Checking if employee1 is an instance of the Employee class
    if (employee1 instanceof Employee) {
      employee1.displayDetails(); // Display details if true
    } else {
      System.out.println("employee1 is not an instance of Employee class.");
    }

    // Creating second employee object
    Employee employee2 = new Employee("Duggu", 77, "Developer");

    // Checking if employee2 is an instance of the Employee class
    if (employee2 instanceof Employee) {
      employee2.displayDetails(); // Display details if true
    } else {
      System.out.println("employee2 is not an instance of Employee class.");
    }

    // Calling static method to display the total number of employees
    Employee.displayTotalEmployees();
  }
}
