package interfaces;

public class Utils {
	
	public static void runLoggers(Logger[] loggers, String message) {
		
		for(Logger logger : loggers) {
			logger.log(message);
		}
		
	}

}
//kendimi tekrar etmemek için utils açtýk
//loggerlar deðiþebilir mesajým deðiþebilir
//static yaptýk ve bo-öylece utils new lemeye gerek kalmadý