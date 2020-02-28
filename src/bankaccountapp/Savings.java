package bankaccountapp;

public class Savings extends Account {
	// List properties specific for savings account
	private int safetyDepositBoxID;
	private int safetyDepositKey;

	// Call the constructor to initialize settings for Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBoxID();

		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		// System.out.println("NEW SAVINGS ACCOUNT");
		// System.out.println("NAME: " + name);

	}

	@Override
	public void setRate() {
		// System.out.println("Implement rate for Checking");
		rate = getBaseRate() - 0.25;

	}

	private void setSafetyDepositBoxID() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		// System.out.println(safetyDepositBoxID);
		safetyDepositKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// List any methods specific for savings account
	public void showInfo() {
		// System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println("YOUR SAVINGS ACCOUNT FEATURES:"
				+ "\n Safety Deposit Box ID: " + safetyDepositBoxID
				+ "\n Safety Deposit Box Key: " + safetyDepositKey);
	}

	public double getBaseRate() {
		// TODO Auto-generated method stub
		return 2.5;
	}

	

}
