// Class representing a Student in the university
class Student {
  // Static variable shared by all students (university name)
  static String universityName = "Global University";

  // Instance variables unique to each student
  private String name;
  private final int rollNumber; // Final variable to ensure roll number cannot be changed
  private char grade;

  // Static variable to track the total number of students
  static int totalStudents = 0;

  // Constructor to initialize student details using 'this' keyword
  Student(String name, int rollNumber, char grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    totalStudents++; // Increment total students when a new object is created
  }

  // Static method to display the total number of students enrolled
  static void displayTotalStudents() {
    System.out.println("Total Students Enrolled: " + totalStudents + "\n");
  }

  // Method to update the grade of the student
  void updateGrade(char newGrade) {
    this.grade = newGrade;
  }

  // Method to display student details
  void displayStudentDetails() {
    System.out.println("University Name: " + universityName);
    System.out.println("Name           : " + name);
    System.out.println("Roll Number    : " + rollNumber);
    System.out.println("Grade          : " + grade + "\n");
  }
}

// Main class to manage the student system
public class UniversityStudentManagement {
  public static void main(String[] args) {
    System.out.println("\nRegistering students......\n");

    // Creating student objects
    Student student1 = new Student("Alice", 101, 'B');
    Student student2 = new Student("Bob", 102, 'C');

    // Checking if student1 is an instance of Student class before processing
    if (student1 instanceof Student) {
      student1.displayStudentDetails();
    } else {
      System.out.println("student1 is not an instance of Student class.");
    }

    // Checking if student2 is an instance of Student class before processing
    if (student2 instanceof Student) {
      student2.displayStudentDetails();
    } else {
      System.out.println("student2 is not an instance of Student class.");
    }

    // Updating the grade of student1
    student1.updateGrade('A');

    System.out.println("After updating grade of student 1......\n");
    // Display updated details of student1
    student1.displayStudentDetails();

    // Display total number of students
    Student.displayTotalStudents();
  }
}
