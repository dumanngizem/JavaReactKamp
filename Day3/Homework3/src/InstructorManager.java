
public class InstructorManager extends UserManager{

	public void addLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� " + instructor.getUserType() + " yeni ders ekledi.");
	}
	
	public void removeLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� " + instructor.getUserType() + " dersi sildi.");
	}
	
	public void updateLesson(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� " + instructor.getUserType() + " dersi g�ncelledi.");
	}
	
	public void addHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� " + instructor.getUserType() + " yeni �dev ekledi.");
	}
	
	public void removeHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� " + instructor.getUserType() + " �devi sildi.");
	}
	
	public void updateHomeWork(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " adl� " + instructor.getUserType() + " �devi g�ncelledi.");
	} 
}
