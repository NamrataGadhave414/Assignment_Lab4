package quest4;

import java.util.Scanner;

class Loan {
    private String bankName;
    private String accountType;
    private long accountNumber;
    private String userName;
    private String password;
    private double balance;

    public Loan(String bankName, String accountType, long accountNumber, String userName, String password) {
        this.bankName = bankName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.password = password;
        this.balance = 0.0; // Initialize balance to zero
    }

    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("User Name: " + userName);
        // We're not displaying the password for security reasons.
        // System.out.println("Password: " + password);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void applyLoan(double loanAmount) {
        // Simplified loan processing logic; just print a message.
        if (loanAmount > 0) {
            System.out.println("Loan application for $" + loanAmount + " submitted. Processing...");
            System.out.println("Congratulations! Your loan of $" + loanAmount + " has been approved.");
        } else {
            System.out.println("Invalid loan amount.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Our Bank!");

        // Get user details
        System.out.print("Enter Bank Name: ");
        String bankName = scanner.nextLine();

        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = scanner.nextLong();
        scanner.nextLine(); // Consume the newline left by nextLong()

        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Create a bank account object with user details
        Loan bankAccount = new Loan(bankName, accountType, accountNumber, userName, password);

        // Display user details
        System.out.println("\nAccount Details:");
        bankAccount.displayAccountDetails();

        // Perform transactions
        System.out.print("\nEnter Deposit Amount: ");
        double depositAmount = scanner.nextDouble();
        bankAccount.deposit(depositAmount);

        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = scanner.nextDouble();
        bankAccount.withdraw(withdrawalAmount);

        // Loan processing
        System.out.print("\nEnter Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        bankAccount.applyLoan(loanAmount);

        scanner.close();
    }
}
