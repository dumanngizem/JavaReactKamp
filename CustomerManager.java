package inheritance;

public class CustomerManager {

	//Polimorfizim ----> Sen bir müþterisin dediðimiz için add teki costumer onu extends eden kodlarýn referansýný tutabilir.
	public void add(Customer customer) {
		//extend ettiðimiz için Customer customer dedik.
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			add(customer);
		}
	}
}

//SOLID ----->Open Closed Principle----> yeni özellik eklendiðinde mevcutta olan kodu deðiþtiremeyiz.