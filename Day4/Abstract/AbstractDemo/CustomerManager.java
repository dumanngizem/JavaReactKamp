package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager; //bizim stratejimiz.Hangi veriyi verirsek onun datas�n� getirecek.

	public void getCustomers(){
		//M��terileri getir
	
		databaseManager.getData();
	}
}
