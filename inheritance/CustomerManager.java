package inheritance;

public class CustomerManager {

	//Polimorfizim ----> Sen bir m��terisin dedi�imiz i�in add teki costumer onu extends eden kodlar�n referans�n� tutabilir.
	public void add(Customer customer) {
		//extend etti�imiz i�in Customer customer dedik.
		System.out.println(customer.customerNumber + " Kaydedildi.");
	}
	
	// bulk insert
	public void addMultiple(Customer[] customers) {
		
		for(Customer customer : customers) {
			add(customer);
		}
	}
}

//SOLID ----->Open Closed Principle----> yeni �zellik eklendi�inde mevcutta olan kodu de�i�tiremeyiz.