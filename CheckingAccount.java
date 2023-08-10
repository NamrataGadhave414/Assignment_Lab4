package quest1;

class CheckingAccount extends BankAccount {
	public CheckingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: $" + amount);
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn: $" + amount);
		} else {
			System.out.println("Insufficient balance to withdraw $" + amount);
		}
	}
}
