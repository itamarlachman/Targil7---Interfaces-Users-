package interfaces;

import java.util.ArrayList;

import classes.User;

public interface IAdmin {
	public void deleteTopic(String topic);
	public void viewMessages();
	public void deleteUser(User user);
	public void addUser(User user);
	
}
