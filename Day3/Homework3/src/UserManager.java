
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� " + user.getUserType() + " Eklendi.");
		
	}
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� " + user.getUserType() + " Kald�r�ld�.");
		
	}
	
	public void upload(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� " + user.getUserType() + " G�ncelledi.");
		
	}
	public void addComment(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� " + user.getUserType() + " Yorum ekledi.");
		
	}
	public void removeComment(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adl� " + user.getUserType() + " Yorum kald�r�ld�.");
		
	}
}
