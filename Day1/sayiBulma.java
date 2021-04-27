
public class sayiBulma {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,3,9,13,29};
		int search = 3;
		boolean varMi = false;
		
		for(int number : numbers){
			
			if(number == search) {				
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayý mevcuttur.");
		}else {
			System.out.println("Sayý mevcut deðildir.");
		}
	}
}
