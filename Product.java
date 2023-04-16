package bill;

public class Product {
	private String title;
	private double price;
	
	public Product(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() { //1
		return title;
	}
	
	public double getPrice() { //2
		return price;
	}
	
	public boolean equals(Object o) { //3
		if (o instanceof Product) {
			Product p = (Product)o;
			return p.getTitle().equals(title);
		}
		return false;
	}
}