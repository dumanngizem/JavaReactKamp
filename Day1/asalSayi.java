
public class asalSayi {

	public static void main(String[] args) {
		
		int number = 2;
		int kalan = number % 2;
		
		System.out.println(kalan);
		
		boolean asalMi = true;
				
		for(int i = 2; i < number; i++) {
			
			if(number % i == 0) {
				
				asalMi = false;
			}
		}
		
		if(number == 1) {
			System.out.println("Sayý Asal Deðildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Geçersiz Sayý.");
		}
		if(asalMi) {
			
			System.out.println("Sayý Asaldýr.");
			
		}else {
			
			System.out.println("Sayý Asal Deðildir.");
		}

	}

}
