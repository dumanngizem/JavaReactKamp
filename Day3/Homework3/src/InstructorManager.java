
public class InstructorManager extends UserManager{

	public void addLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý " + instructor.getUserType() + " yeni ders ekledi.");
	}
	
	public void removeLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý " + instructor.getUserType() + " dersi sildi.");
	}
	
	public void updateLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý " + instructor.getUserType() + " dersi güncelledi.");
	}
	
	public void addHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý " + instructor.getUserType() + " yeni ödev ekledi.");
	}
	
	public void removeHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý " + instructor.getUserType() + " ödevi sildi.");
	}
	
	public void updateHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adlý " + instructor.getUserType() + " ödevi güncelledi.");
	} 
}
