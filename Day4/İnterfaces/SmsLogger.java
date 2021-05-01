package interfaces;

public class SmsLogger implements Logger{
	// Logger ý SmsLogger ý uyarla demek implements.
	
	@Override
	public void log(String message) {
		
		System.out.println("Sms Gönderildi: " + message);
		
	}

	
}
