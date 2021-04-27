
public class mükemmelSayi {

	public static void main(String[] args) {
		
		int number = 9;
		int toplam = 0;
		
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				toplam += i;
				
			}
		}
		
		if(toplam == number) {
			System.out.println("Mükemmel Sayý.");
		}else {
			System.out.println("Mükemmel Sayý Deðil.");
		}

	}

}
