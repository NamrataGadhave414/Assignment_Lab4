package quest1;

abstract class BankAccount {
	   private String accountNumber;
	    protected double balance;

	    //construction 
	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    
	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public abstract void deposit(double amount); 

	    public abstract void withdraw(double amount);

}
