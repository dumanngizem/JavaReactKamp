package interfaces;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		
		System.out.println("Email gönderildi : " + message);
		
	}
	

}
//Sms çok pahalý email olsun istediler hiç email yoktu baþta bunu oluþturup new e email ekledik.
