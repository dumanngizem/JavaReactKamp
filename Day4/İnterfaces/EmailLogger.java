package interfaces;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		
		System.out.println("Email g�nderildi : " + message);
		
	}
	

}
//Sms �ok pahal� email olsun istediler hi� email yoktu ba�ta bunu olu�turup new e email ekledik.
