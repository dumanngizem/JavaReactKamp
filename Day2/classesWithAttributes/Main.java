package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.name = "Laptop";
		product.id = 29;
		product.description = "Lenovo Laptop";	
		product.price = 15000;
		product.stockAmount = 15;
		
		ProductManager productmanager = new ProductManager();
		productmanager.Add(product);
		
		
	}
	

}
