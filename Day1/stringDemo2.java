
public class stringDemo2 {

	public static void main(String[] args) {
		
		String mesaj = "Hayat bir oyun";
		System.out.println();
		
		System.out.println(mesaj.replace("H", "B"));
		// deðiþtirmek istediðin karakter
		
		System.out.println(mesaj.substring(3));
		//Mesajýn 3. indexten sonrasýný istersek
		
		System.out.println(mesaj.substring(3, 9));
		// 3. indexten 9. indexe kadar olan kýsmý verir
		
		for(String kelime: mesaj.split(" ")){
			//bütün elemanlarý alt alta yazdý boþluk kýsmýndan
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());//Büyük harfe çevirir
		System.out.println(mesaj.trim());// baþýndaki ve sonundaki boþluklarý atmayý saðlar
		
	}

}
