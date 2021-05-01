package interfaces;

//csutomer manager loglamaya ba��ml�
// 2 tip ba��ml�l�k vard�r
//loosly - tightly coupled
//burada loglamaya ba�l�y�z ama gev�ek

public class CustomerManager {
	
	//tasar�m deseni
	//private Logger logger; ----->  Normali bu
	// Birden �ok loglama i�in a�a��dakine �evirdik
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	
	
	public void add(Customer customer) {
		
				
		System.out.println("M��teri eklendi. " + customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		//this.logger.log(customer.getFirstName());-----> Normmalii
		
		/*
		DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " Veritaban�na logland�.");
		//Deseler ki veritaban� de�il dosya olacak*/
		
	}
	public void delete(Customer customer) {
		
		System.out.println("M��teri Silindi. " + customer.getLastName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " Veritaban�na logland�.");*/
	}
		

}

