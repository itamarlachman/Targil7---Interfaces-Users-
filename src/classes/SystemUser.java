package classes;
import interfaces.ILogin;

public abstract class SystemUser extends User implements ILogin  {

	protected String password;

	public SystemUser(String name, String email,String password) {
		super(name, email);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return super.toString() + " password=" + password;
	}

}
