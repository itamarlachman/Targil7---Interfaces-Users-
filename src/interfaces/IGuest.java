package interfaces;

import classes.Admin;

public interface IGuest {
	public void contactAdmin(String message, Admin admin);
	public void rateAnswer(String answer,int rate);

}
