
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
			System.out.println("Say� Asal De�ildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Ge�ersiz Say�.");
		}
		if(asalMi) {
			
			System.out.println("Say� Asald�r.");
			
		}else {
			
			System.out.println("Say� Asal De�ildir.");
		}

	}

}
