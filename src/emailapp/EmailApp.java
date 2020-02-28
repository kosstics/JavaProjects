package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		
		Email em1=new Email("Snežana", "Kostiæ");
		
		/* em1.setAlternateEmail("ks@gmail.com");
		System.out.println("Your alternate email address is : " + em1.getAlternateEmail());
		 we don't need this, we can just call: */
		
		System.out.println(em1.showInfo());
		
	}

}
