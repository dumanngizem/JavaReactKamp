
public class main {

	public static void main(String[] args) {
		
		String mesaj = "Don't Repeat Yourself";
		System.out.println(mesaj);
		
		System.out.println("Eleman Say�s� = " +mesaj.length());
		
		System.out.println("10.eleman =" +mesaj.charAt(9));
		
		System.out.println(mesaj.concat(" Gizem!"));
		
		System.out.println(mesaj.startsWith("A"));
		//A harfi ile mi ba�l�yor? Geriye true or false d�nd�r�r
		
		System.out.println(mesaj.endsWith("f"));
		//! harfi ile mi bitiyor? Geriye true or false d�nd�r�r
		//JAva b�y�k k���k harf duyarl� dikkat.
		
		char[] karakterler = new char[10];
		mesaj.getChars(0, 8, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("p"));
		//mesaj�n i�inde ka��nc� harf p onu arar. �lk buldu�unu veriri. Metin de aranabilir
		
		System.out.println(mesaj.lastIndexOf("p"));
		//sa�dan aramaya ba�lar
	}

}
