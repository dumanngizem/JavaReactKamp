package interfaces;

public class Utils {
	
	public static void runLoggers(Logger[] loggers, String message) {
		
		for(Logger logger : loggers) {
			logger.log(message);
		}
		
	}

}
//kendimi tekrar etmemek i�in utils a�t�k
//loggerlar de�i�ebilir mesaj�m de�i�ebilir
//static yapt�k ve bo-�ylece utils new lemeye gerek kalmad�