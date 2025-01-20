// Class representing a Product in the shopping cart
class Product {
  // Static variable shared by all products (discount percentage)
  static double discount = 10.0; // Default discount in percentage

  // Instance variables unique to each product
  private String productName;
  private double price;
  private int quantity;
  private final int productID; // Final variable to ensure unique identifier

  // Static method to update the discount percentage for all products
  static void updateDiscount(double newDiscount) {
    discount = newDiscount;
    System.out.println("Updated discount to: " + discount + "%\n");
  }

  // Constructor to initialize product details using 'this' keyword
  Product(String productName, double price, int quantity, int productID) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
    this.productID = productID;
  }

  // Method to calculate total price after applying the discount
  double getTotalPrice() {
    double discountedPrice = price - (price * discount / 100);
    return discountedPrice * quantity;
  }

  // Method to display product details
  void displayProductDetails() {
    System.out.println("Product ID    : " + productID);
    System.out.println("Product Name  : " + productName);
    System.out.println("Price         : RS " + price);
    System.out.println("Quantity      : " + quantity);
    System.out.println("Discount      : " + discount + "%");
    System.out.println("Total Price   : RS " + getTotalPrice() + "\n");
  }
}

// Main class to manage the shopping cart system
public class ShoppingCartSystem {
  public static void main(String[] args) {
    System.out.println("\nAdding products to the cart...\n");

    // Creating product objects
    Product product1 = new Product("Laptop", 50000, 2, 101);
    Product product2 = new Product("Phone", 20000, 3, 102);

    // Checking if product1 is an instance of Product class before processing
    if (product1 instanceof Product) {
      product1.displayProductDetails();
    } else {
      System.out.println("product1 is not an instance of Product class.");
    }

    // Checking if product2 is an instance of Product class before processing
    if (product2 instanceof Product) {
      product2.displayProductDetails();
    } else {
      System.out.println("product2 is not an instance of Product class.");
    }

    // Updating discount for all products
    Product.updateDiscount(15.0);

    // Display details again to reflect new discount
    product1.displayProductDetails();
    product2.displayProductDetails();
  }
}
