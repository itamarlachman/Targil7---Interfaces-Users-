package classes;
import interfaces.IGuest;

public class Guest extends User implements IGuest {

	public Guest(String name, String email) {
		super(name, email);
	}

	@Override
	public void contactAdmin(String message, Admin admin) {
		admin.addMessage(message);
		System.out.println("Contacted Admin with message: " + message + " OK.");
	}

	@Override
	public void rateAnswer(String answer, int rate) {
		System.out.println("Answer: " + answer + " Rated: " + rate);
		
	}

}
