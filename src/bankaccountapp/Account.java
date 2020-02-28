package bankaccountapp;

public abstract class Account implements IRate {
	// abstract means that we can't create object here but we can create objects
	// in classes that inherit Account

	// List common properties for savings and checking account

	private String name;
	private String sSN; // Social Security Number
	private double balance;

	private static int index = 10000;
	protected String accountNumber;
	protected double rate;

	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		// System.out.println("NAME: " + name);
		// System.out.print("NEW ACCOUNT: ");
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit + 100;

		// System.out.println("NAME: " + name + "; SSN: " + sSN + "; BALANCE: "
		// + balance);

		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);

		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;

	}

	public void compound() {
		double accruedInterest = balance * (rate / 100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}

	// List common methods - transactions
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: "
				+ accountNumber + "\nBALANCE: " + balance + "\nRATE: " + rate
				+ "%");

	}

}
