package inheritance;

public class Main {

	public static void main(String[] args) {
		// Ýnheritance(miras)---> iki sýnfýmýz var ikisi ortak fonksiyon kullanacak
		//base/super class id ve customernumber ortak onlarý siliyoruz bireysel ve kurumsalda ortak çünkü
		
		IndividualCustomer gizem = new IndividualCustomer();
		gizem.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="6789";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {gizem, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		

	}

}
