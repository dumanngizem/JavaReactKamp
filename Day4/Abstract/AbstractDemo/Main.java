package abstractDemo;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
//Bir sisteme yeni bir değişiklik getireceksek mevcut kodu değiştiremezsin.
//Burası konfigürasyondur bu kısım değiişebilir.
