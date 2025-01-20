// Class to represent a bank account
class BankAccount {
  // Static variable to track total number of accounts (shared among all objects)
  static int numberOfAccount = 0;

  // Static variable to store the bank's name (common for all accounts)
  static String bankName = "Lakshmi Chitt Fund";

  // Instance variable to store the account holder's name (unique for each
  // account)
  public String accountHolderName;

  // Final instance variable to store account number (cannot be changed once
  // assigned)
  final long accountNumber;

  // Constructor to initialize account details and increase account count
  BankAccount(String accountHolderName, long accountNumber) {
    this.accountHolderName = accountHolderName;
    this.accountNumber = accountNumber;
    numberOfAccount++; // Increment total account count
  }

  // Static method to get the total number of accounts
  static int getTotalAccounts() {
    return numberOfAccount;
  }

  // Method to display account details
  void getDetails() {
    System.out.println("\nDetails of Account Holder " + numberOfAccount + "......\n");
    System.out.println("Account holder name is : " + accountHolderName);
    System.out.println("Account number is      : " + accountNumber);
  }
}

// Main class to demonstrate the BankAccount class
public class BankAccountSystem {
  public static void main(String[] args) {

    // Displaying bank name using static variable (without creating an object)
    System.out.println("\nBank name is : " + BankAccount.bankName);

    // Creating first bank account object
    BankAccount account1 = new BankAccount("Sachin", 11155544);

    // Checking if account1 is an instance of BankAccount
    if (account1 instanceof BankAccount) {
      account1.getDetails(); // Display details if true
    } else {
      System.out.println("account1 is not an instance of BankAccount");
    }

    // Creating second bank account object
    BankAccount account2 = new BankAccount("Duggu", 22255544);

    // Checking if account2 is an instance of BankAccount
    if (account2 instanceof BankAccount) {
      account2.getDetails(); // Display details if true
    } else {
      System.out.println("account2 is not an instance of BankAccount");
    }

    // Displaying total number of bank accounts created using static method
    System.out.println("\nTotal number of accounts are : " + BankAccount.getTotalAccounts());
  }
}
