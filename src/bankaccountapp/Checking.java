package bankaccountapp;

public class Checking extends Account {
	// List properties specific for checking account
	private int debitCardNumber;
	private int debitCardPIN;

	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		// System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		// System.out.println("NEW CHECKING ACCOUNT");
		// System.out.println("NAME: "+ name);
		setDebitCard();
	}

	@Override
	public void setRate() {
		//System.out.println("Implement rate for Checking");
		rate = getBaseRate()*.15;
	}

	// List any methods specific for checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
		// System.out.println("CARD: "+ this.debitCardNumber);
		// System.out.println("CARD PIN: "+ this.debitCardPIN);
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR CHECKING ACCOUNT FEATURES: "
				+ "\n Debit card number: " + debitCardNumber
				+ "\n Debit card PIN: " + debitCardPIN);
	}

	public double getBaseRate() {
		// TODO Auto-generated method stub
		return 2.5;
	}
}
