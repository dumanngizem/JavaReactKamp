package interfaces;

public class SmsLogger implements Logger{
	// Logger � SmsLogger � uyarla demek implements.
	
	@Override
	public void log(String message) {
		
		System.out.println("Sms G�nderildi: " + message);
		
	}

	
}
