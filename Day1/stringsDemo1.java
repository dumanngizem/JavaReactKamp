
public class main {

	public static void main(String[] args) {
		
		String mesaj = "Don't Repeat Yourself";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayýsý = " +mesaj.length());
		
		System.out.println("10.eleman =" +mesaj.charAt(9));
		
		System.out.println(mesaj.concat(" Gizem!"));
		
		System.out.println(mesaj.startsWith("A"));
		//A harfi ile mi baþlýyor? Geriye true or false döndürür
		
		System.out.println(mesaj.endsWith("f"));
		//! harfi ile mi bitiyor? Geriye true or false döndürür
		//JAva büyük küçük harf duyarlý dikkat.
		
		char[] karakterler = new char[10];
		mesaj.getChars(0, 8, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("p"));
		//mesajýn içinde kaçýncý harf p onu arar. Ýlk bulduðunu veriri. Metin de aranabilir
		
		System.out.println(mesaj.lastIndexOf("p"));
		//saðdan aramaya baþlar
	}

}
