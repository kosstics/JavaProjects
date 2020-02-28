package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String alternateEmail; /*alternate email address*/
	private int capacity=500; /*mailbox Capacity*/
	private int defaultPasswordLength=10;
	private String companySuffix = "company.com";
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email created: " + this.firstName + " " + this.lastName );
	
		
		//Call a method asking for department and return department 
		this.department = setDepartment();
		//System.out.println("Department is: " + this.department);
		
		
		//Call a method that returns a random password
		this.password= randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
	
		//Combine elements to generate mail
		
		email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	//	System.out.println("Your email is: " + email);
	} 
	
	
	//Ask for the department
	private String setDepartment(){
	System.out.print("New worker: " + firstName+ "." + "Department codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
	Scanner in = new Scanner(System.in);
	int depChoice = in.nextInt();
	if (depChoice == 1){return "sales";}
	else if (depChoice == 2){return "devel";}
	else if (depChoice == 3){return "acct";}
	else {return "";}
			
	}
	
	
	//Generate a random password
	
	private String randomPassword(int length){
		String passwordSets="ABCDEFGHIJKLMNOPRSTUYVWZ1234567890#$%&@";
		char[] password= new char[length];
		for (int i=0; i<length; i++){
			int random = (int) (Math.random() * passwordSets.length());
		
			password[i]=passwordSets.charAt(random);
		}
			return new String(password);
	}
	
	//Set the mailbox capacity
	public void setUpMailboxCapacity(int capacity){
		this.capacity=capacity;
	}
	
	//Set the alternate email address
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password){
		this.password=password;
	}
	
	public int getMailboxCapacity(){return capacity;}
	public String getAlternateEmail(){return alternateEmail;}
	public String getPassword(){return password;}
	
	public String showInfo(){
		return ("DISPLAY NAME: " + firstName + " " + lastName +
		"\nCOMPANY EMAIL: " + email +
		"\nMAILBOX CAPACITY: " + capacity + "mb");
	}
	
}
