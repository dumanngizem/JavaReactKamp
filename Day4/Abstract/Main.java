package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
//kad�n erkek �ocuk olsa da hepsinde hesaplama var.(base)
//game calculator� kim kullan�yorsa gameOver kesinlikle kullanmak zorunda
//Kim inharite ediyorsa implement ediyorsa hesaplamay� kullanmak zorunda fakat hesaplay� @Override etmek zorunda yani kendi hesaplamal�
//bir abstract ta bir tane abstract olmak zorunda de�il 
//abstarctlar bizim base mizi gizlemeye de yarar
//Abstract s�n�flar asla new lenemez!!!!!