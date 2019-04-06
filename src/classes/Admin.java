package classes;

import java.util.ArrayList;

import interfaces.IAdmin;

public class Admin extends SystemUser implements IAdmin {

	ArrayList<String> messages = new ArrayList<String>();
		
	public Admin(String name, String email,String password) {
		super(name, email,password);
	}

	@Override
	public Boolean login(String email, String password) {
		if (email.equals(email) & password.equals(password))
			return true;
		else
			return false;
	}

	@Override
	public Boolean logout() {
		return true;
	}

	@Override
	public void deleteTopic(String topic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewMessages() {
		for( String message: messages) {
			System.out.println(message);
		}
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void addMessage(String message) {
		this.messages.add(message);
	}
	
}
