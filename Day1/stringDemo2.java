
public class stringDemo2 {

	public static void main(String[] args) {
		
		String mesaj = "Hayat bir oyun";
		System.out.println();
		
		System.out.println(mesaj.replace("H", "B"));
		// de�i�tirmek istedi�in karakter
		
		System.out.println(mesaj.substring(3));
		//Mesaj�n 3. indexten sonras�n� istersek
		
		System.out.println(mesaj.substring(3, 9));
		// 3. indexten 9. indexe kadar olan k�sm� verir
		
		for(String kelime: mesaj.split(" ")){
			//b�t�n elemanlar� alt alta yazd� bo�luk k�sm�ndan
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//k���k harfe �evirir
		System.out.println(mesaj.toUpperCase());//B�y�k harfe �evirir
		System.out.println(mesaj.trim());// ba��ndaki ve sonundaki bo�luklar� atmay� sa�lar
		
	}

}
