package interfacesDemo;

public class Main {

	public static void main(String[] args) {
		
		ICustomerDal customerDal = new OracleCustomerDal();
	}

}


//interface----> class değil referans tutucu
//interface---->  new lenemez. İmza taşırlar.
//interface---->  kim onu implements edecekse o kullansn
//interface---->  yazılımda 3 katman var. Arayüz-İş-Data Access layer. Bunlar arasındaki geçişleri interfaces ile yaparız.
//Çünkü bağımlılığı önleriz.
