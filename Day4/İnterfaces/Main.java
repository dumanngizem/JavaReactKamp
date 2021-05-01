package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(), new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		//Senin baðýmlýlýðýn sms oluyor dedik.
		//Artýk sms istemezsen fikrin deðiþirse direk sil yaz
		
		Customer gizem = new Customer(1, "Gizem", "Duman");
		customerManager.add(gizem);

	}

}
//implements ettiðinde bir classa tüm methodlarý zorunlu hale getiriyor 
//ama baþka bi classtan extends aldýðýmýzda o mecburiyet ortadan kalkýyor