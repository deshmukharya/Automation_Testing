package First;

//Class representing a Bank Account
class BankAccount {
 // Private member variables
 private String accountNumber;
 private double balance;
 private String ownerName;
 
 // Constructor to initialize the account
 public BankAccount(String accountNumber, double balance, String ownerName) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     this.ownerName = ownerName;
 }
 
 // Getter method for account number
 public String getAccountNumber() {
     return accountNumber;
 }
 
 // Getter method for balance
 public double getBalance() {
     return balance;
 }
 
 // Getter method for owner's name
 public String getOwnerName() {
     return ownerName;
 }
 
 // Method to deposit money into the account
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println(amount + " deposited successfully.");
     } else {
         System.out.println("Invalid amount for deposit.");
     }
 }
 
 // Method to withdraw money from the account
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println(amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient funds or invalid amount for withdrawal.");
     }
 }
}

public class Encapsulation {
 public static void main(String[] args) {
     // Creating a BankAccount object
     BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");
     
     // Accessing account details using getter methods
     System.out.println("Account Number: " + account.getAccountNumber());
     System.out.println("Owner Name: " + account.getOwnerName());
     System.out.println("Current Balance: " + account.getBalance());
     
     // Depositing and withdrawing money
     account.deposit(500.0);
     account.withdraw(200.0);
     
     // Displaying updated balance
     System.out.println("Updated Balance: " + account.getBalance());
 }
}
