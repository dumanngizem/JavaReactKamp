package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "Denizli";
		sehirler[0][1] = "Ýzmir";
		sehirler[0][2] = "Muðla";
		sehirler[1][0] = "Antalya";
		sehirler[1][1] = "Mersin";
		sehirler[1][2] = "Adana";
		sehirler[2][0] = "Ýstanbul";
		sehirler[2][1] = "Bursa";
		sehirler[2][2] = "Kocaeli";
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println("################");
			
			for(int j = 0; j <= 2; j++) {
				
				System.out.println(sehirler[i][j]);
			}
		}
		
	}

}
