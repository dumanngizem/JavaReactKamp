package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager; //bizim stratejimiz.Hangi veriyi verirsek onun datasını getirecek.

	public void getCustomers(){
		//Müşterileri getir
	
		databaseManager.getData();
	}
}
