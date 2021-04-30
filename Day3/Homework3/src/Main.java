
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Gizem");
		student.setLastName("Duman");
		student.setEmail("gduman16@hotmail.com");
		student.setPassword("12345");
		student.setUserType("��renci");
		student.setCourse("Java + React");
		
		
		
				
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindmrg@hotmail.com");
		instructor.setPassword("159357");
		instructor.setUserType("E�itmen");
		instructor.setDescription("�niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m. S�ras�yla Ba�kent ve ODT�'de Y�netim Bili�im Sistemleri (Lisans-Burslu) ve T�p Bili�imi(Y�ksek Lisans) okudum. Profesyonel i� hayat�ma ise hen�z �niversite birinci s�n�ftayken ba�lad�m.\r\n"
				+ "\r\n"
				+ "A��rl�kl� olarak Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k veriyorum.\r\n"
				+ "\r\n"
				+ "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalar�na sahibim.\r\n"
				+ "\r\n"
				+ "\"Engin Demiro�\" YouTube kanal�mda �cretsiz e�itim videolar� ve i�erikleri payla�maktay�m.\r\n"
				+ "\r\n"
				+ "Dan��manl�k yapt���m kurumlar�n baz�lar� : Merkez Bankas�,TAI, Birle�mi� Milletler,NATO,�� Bankas�, Akbank, Halkbank, Vak�fbank, Yap� Kredi Bankas�, Ziraat Bankas�, Emniyet, Ba�bakanl�k, Cumhurba�kanl���, Hazine M�ste�arl���, Maliye Bakanl���, Tar�m Bakanl���, T�bitak.\r\n"
				+ "\r\n"
				+ "Dan��manl�k veya e�itim verdi�im kurum say�s� son 10 y�lda 300'� ge�mi�tir.\r\n"
				+ "\r\n"
				+ "DevFramework ismiyle geli�tirdi�im altyap� projem bir�ok kurum ve firmada yaz�l�m geli�tirme altyap�s� olarak kullan�lmaktad�r.");
		
		
		
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.remove(student);
		userManager.addComment(student);
		userManager.removeComment(student);
		userManager.upload(student);
		
		System.out.println("\n ########################## \n");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.addComment(student);
		studentManager.removeComment(student);
		studentManager.upload(student);
		studentManager.join(student);
		studentManager.leave(student);
		studentManager.next(student);
		studentManager.previous(student);
		
		System.out.println("\n ########################## \n");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.remove(instructor);
		instructorManager.addComment(instructor);
		instructorManager.removeComment(instructor);
		instructorManager.addLesson(instructor);
		instructorManager.removeLesson(instructor);
		instructorManager.updateLesson(instructor);
		instructorManager.addHomeWork(instructor);
		instructorManager.removeHomeWork(instructor);
		instructorManager.updateHomeWork(instructor);
		

	}

}
