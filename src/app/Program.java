package app;

import classes.Admin;
import classes.ContentManager;
import classes.Guest;

public class Program {

	public static void main(String[] args) {
		Admin admin = new Admin("itamar","itamar@gmail.com", "1234");
		admin.login("itamar@gmail.com","1234");
				
		ContentManager contentManager = new ContentManager("avi", "avi@gmail.com", "1234");
		contentManager.login("avi@gmail.com", "1234");
		contentManager.changeTopic("Topic1", "Topic 1 - New");
		
		Guest guest = new Guest("guest1", "guest1@gmail.com");
		guest.contactAdmin("Hi from guest1",admin);
		guest.contactAdmin("Hi again from guest1",admin);

		admin.viewMessages();
	}
}
