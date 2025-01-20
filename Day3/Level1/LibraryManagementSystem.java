// Class representing a Book
class Book {
  // Static variable shared by all Book objects (common library name)
  static String libraryName = "Library of Bhopal";

  // Private instance variables unique to each book
  private String title;
  private String author;

  // Final variable to store ISBN number (cannot be changed once assigned)
  final int isbn;

  // Constructor to initialize book details
  Book(String title, String author, int isbn) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  // Static method to display the library name (can be called without an object)
  static void displayLibraryName() {
    System.out.println("Library name is : " + libraryName);
  }

  // Instance method to display details of the book
  void displayDetails() {
    System.out.println("Title of book is  : " + title);
    System.out.println("Author of book is : " + author);
    System.out.println("ISBN of book is   : " + isbn + "\n");
  }
}

// Main class to manage books in the library
public class LibraryManagementSystem {
  public static void main(String[] args) {
    System.out.println("\nShowing details of books......\n");

    // Creating the first book object
    Book book1 = new Book("Default book", "Sachin", 123);

    // Checking if book1 is an instance of the Book class
    if (book1 instanceof Book) {
      book1.displayDetails(); // Display book details if true
    } else {
      System.out.println("book1 is not an instance of Book class.");
    }

    // Creating the second book object
    Book book2 = new Book("Random book", "Duggu", 125);

    // Checking if book2 is an instance of the Book class
    if (book2 instanceof Book) {
      book2.displayDetails(); // Display book details if true
    } else {
      System.out.println("book2 is not an instance of Book class.");
    }

    // Calling the static method to display the library name (without creating an object)
    Book.displayLibraryName();
  }
}
