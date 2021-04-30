package inheritance2;

public class FileLogger extends Logger{
	@Override //javada yazmaya gerek yok ama okunurluk açýsýndan iyi
	public void log() {
		System.out.println("Dosya loglandý");
	}

}
