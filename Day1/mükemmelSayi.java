
public class m�kemmelSayi {

	public static void main(String[] args) {
		
		int number = 9;
		int toplam = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				toplam += i;
				
			}
		}
		
		if(toplam == number) {
			System.out.println("M�kemmel Say�.");
		}else {
			System.out.println("M�kemmel Say� De�il.");
		}

	}

}
