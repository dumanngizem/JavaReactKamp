package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(), new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		//Senin ba��ml�l���n sms oluyor dedik.
		//Art�k sms istemezsen fikrin de�i�irse direk sil yaz
		
		Customer gizem = new Customer(1, "Gizem", "Duman");
		customerManager.add(gizem);

	}

}
//implements etti�inde bir classa t�m methodlar� zorunlu hale getiriyor 
//ama ba�ka bi classtan extends ald���m�zda o mecburiyet ortadan kalk�yor