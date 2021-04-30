
public class StudentManager extends UserManager{
	
	public void join(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� " + student.getUserType() + " Kursa kat�ld�.");
	}
	public void leave(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� " + student.getUserType() + " Kurstan ayr�ld�.");
	}
	public void next(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� " + student.getUserType() + " Sonraki derse ge�ti.");
	}
	public void previous(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl� " + student.getUserType() + " �nceki derse ge�ti.");
	}
		
	
}
