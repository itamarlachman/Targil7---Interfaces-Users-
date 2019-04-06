package classes;

import interfaces.IContentManager;

public class ContentManager extends SystemUser implements IContentManager {

	public ContentManager(String name, String email,String password) {
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
	public void changeTopic(String Topic, String message) {
		// TODO Auto-generated method stub
		
	}

}
