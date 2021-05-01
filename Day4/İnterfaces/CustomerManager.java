package interfaces;

//csutomer manager loglamaya baðýmlý
// 2 tip baðýmlýlýk vardýr
//loosly - tightly coupled
//burada loglamaya baðlýyýz ama gevþek

public class CustomerManager {
	
	//tasarým deseni
	//private Logger logger; ----->  Normali bu
	// Birden çok loglama için aþaðýdakine çevirdik
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	
	
	public void add(Customer customer) {
		
				
		System.out.println("Müþteri eklendi. " + customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName());-----> Normmalii
		
		/*
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " Veritabanýna loglandý.");
		//Deseler ki veritabaný deðil dosya olacak*/
		
	}
	public void delete(Customer customer) {
		
		System.out.println("Müþteri Silindi. " + customer.getLastName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " Veritabanýna loglandý.");*/
	}
		

}

