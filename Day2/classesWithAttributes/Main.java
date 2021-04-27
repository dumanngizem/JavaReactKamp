package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setName("Laptop");
		//product.id = 29; bunun yerine artýk yazabiliriz
		product.setId(29);
		product.setDescription("Lenovo Laptop");	
		product.setPrice(15000);
		product.setStockAmount(15);
		product.setRenk("Mavi");
		
		
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		System.out.println(product.getKod());
		
		
	}
	

}
