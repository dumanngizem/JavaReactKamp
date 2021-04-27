
public class Main {

	public static void main(String[] args) {
					
			Course course1 = new Course("Yazilim Gelistirici Yetistirme Kampi (C# + Angular)","Engin Demirog",0);
			Course course2 = new Course("Yazilim Gelistirici Yetistirme Kampi (Java + React)","Engin Demirog",0);
			Course course3 = new Course(null, null, 0);
			
			course3.courseName = "Programlamaya Giris Için Temel Kurs";
			course3.courseInstructor = "Engin Demirog";
			course3.price = 0;
			
			Course[] courses = {course1,course2,course3};
			System.out.println("Number of Available Courses: " + courses.length + "\n");
			
			for (Course course:courses) {
				
				System.out.println("Course Name: " + course.courseName);
				System.out.println("Course Instructor: " + course.courseInstructor);
				System.out.println("Course Price: " + course.price + "\n");
			}
			
			Student student1 = new Student(1,"Gizem","Duman");
			Student student2 = new Student(2,"Hilal","Koçarslan");
			
			Student[] students = {student1, student2};
			
			for (Student student : students) {
				
				System.out.println("Student Id: " + student.id);
				System.out.println("Student Name: " + student.Name);
				System.out.println("Student Surname: " + student.Surname);
			}
			
	}

}
