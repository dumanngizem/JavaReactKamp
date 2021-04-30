
public class Instructor extends User{
	
	private String description;
	
	public Instructor() {
		
	}
	public Instructor(int id, String firstName, String lastName, String email, String password, String userType, String description) {
		super(id, firstName, lastName, email, password, userType);
		this.description = description;
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
}
