package quest1;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount("123456789",98564);

        System.out.println("Account Number: " + checkingAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + checkingAccount.getBalance());

        checkingAccount.deposit(600.0);
        System.out.println("Updated Balance after Deposit: $" + checkingAccount.getBalance());

        checkingAccount.withdraw(250.0);
        System.out.println("Updated Balance after Withdrawal: $" + checkingAccount.getBalance());

        checkingAccount.withdraw(1600.0); // Trying to withdraw more than the balance
    }
}


//the abstract class BankAccount defines the common attributes and 
//abstract methods deposit and withdraw. The CheckingAccount subclass 
// inherits from BankAccount and provides concrete implementations of 
// the abstract methods. The Main class demonstrates creating a CheckingAccount object,
//calling both deposit and withdraw methods, and displaying the updated balance.