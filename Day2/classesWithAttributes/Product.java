package classesWithAttributes;

public class Product {

	//attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	//Bunlar� d��ar�dan ula�mak ve kullanma i�in getter ve setter kullan�r�z
	//Getter
	public int getId() {
		return id;
	}
	
	//Setter
	//her yere this.id yerine _id kullanmak daha kolay. _ olanlar field.
	//this benim bulundu�um class�n nesnesi demek
	public void setId(int id) {
		this.id = id;		
	}

	private String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	private double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	private String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	private int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	private String getRenk() {
		return renk;
	}

	void setRenk(String renk) {
		this.renk = renk;
	}
	
	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	
	// Bunun kolay� name gel---> Right Click---> Refactor---> Encapsulate Fields  
	
	 
}
