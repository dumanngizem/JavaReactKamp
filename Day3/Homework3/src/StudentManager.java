
public class StudentManager extends UserManager{
	
	public void join(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlı " + student.getUserType() + " Kursa katıldı.");
	}
	public void leave(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlı " + student.getUserType() + " Kurstan ayrıldı.");
	}
	public void next(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlı " + student.getUserType() + " Sonraki derse geçti.");
	}
	public void previous(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adlı " + student.getUserType() + " Önceki derse geçti.");
	}
		
	
}
