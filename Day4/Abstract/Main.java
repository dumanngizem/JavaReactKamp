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
//kadýn erkek çocuk olsa da hepsinde hesaplama var.(base)
//game calculatorý kim kullanýyorsa gameOver kesinlikle kullanmak zorunda
//Kim inharite ediyorsa implement ediyorsa hesaplamayý kullanmak zorunda fakat hesaplayý @Override etmek zorunda yani kendi hesaplamalý
//bir abstract ta bir tane abstract olmak zorunda deðil 
//abstarctlar bizim base mizi gizlemeye de yarar
//Abstract sýnýflar asla new lenemez!!!!!