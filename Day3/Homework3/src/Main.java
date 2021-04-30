
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Gizem");
		student.setLastName("Duman");
		student.setEmail("gduman16@hotmail.com");
		student.setPassword("12345");
		student.setUserType("Öðrenci");
		student.setCourse("Java + React");
		
		
		
				
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindmrg@hotmail.com");
		instructor.setPassword("159357");
		instructor.setUserType("Eðitmen");
		instructor.setDescription("Üniversite hayatýma ÖSS 2003 Türkiye derecesiyle baþladým. Sýrasýyla Baþkent ve ODTÜ'de Yönetim Biliþim Sistemleri (Lisans-Burslu) ve Týp Biliþimi(Yüksek Lisans) okudum. Profesyonel iþ hayatýma ise henüz üniversite birinci sýnýftayken baþladým.\r\n"
				+ "\r\n"
				+ "Aðýrlýklý olarak Savunma Sanayisi, Bankacýlýk sektörlerine kurumsal yazýlým geliþtirme süreçleri konusunda danýþmanlýk veriyorum.\r\n"
				+ "\r\n"
				+ "Microsoft Certified Trainer (MCT) ,PMP ve ITIL sertifikalarýna sahibim.\r\n"
				+ "\r\n"
				+ "\"Engin Demiroð\" YouTube kanalýmda ücretsiz eðitim videolarý ve içerikleri paylaþmaktayým.\r\n"
				+ "\r\n"
				+ "Danýþmanlýk yaptýðým kurumlarýn bazýlarý : Merkez Bankasý,TAI, Birleþmiþ Milletler,NATO,Ýþ Bankasý, Akbank, Halkbank, Vakýfbank, Yapý Kredi Bankasý, Ziraat Bankasý, Emniyet, Baþbakanlýk, Cumhurbaþkanlýðý, Hazine Müsteþarlýðý, Maliye Bakanlýðý, Tarým Bakanlýðý, Tübitak.\r\n"
				+ "\r\n"
				+ "Danýþmanlýk veya eðitim verdiðim kurum sayýsý son 10 yýlda 300'ü geçmiþtir.\r\n"
				+ "\r\n"
				+ "DevFramework ismiyle geliþtirdiðim altyapý projem birçok kurum ve firmada yazýlým geliþtirme altyapýsý olarak kullanýlmaktadýr.");
		
		
		
		
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
