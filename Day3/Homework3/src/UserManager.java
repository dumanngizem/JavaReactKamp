
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý " + user.getUserType() + " Eklendi.");
		
	}
	public void remove(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý " + user.getUserType() + " Kaldýrýldý.");
		
	}
	
	public void upload(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý " + user.getUserType() + " Güncelledi.");
		
	}
	public void addComment(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý " + user.getUserType() + " Yorum ekledi.");
		
	}
	public void removeComment(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý " + user.getUserType() + " Yorum kaldýrýldý.");
		
	}
}
