
public class CourseManager {
	
	public void Add(Course course) {
		System.out.println(course.courseName + "Kursu eklendi." );
		System.out.println("Instructor" + course.courseInstructor);
	}
	public void Remove(Course course) {
		System.out.println(course.courseName + "Kursu ��kar�ld�." );
		System.out.println("Instructor" + course.courseInstructor);
	}
}
