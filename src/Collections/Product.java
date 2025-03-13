package Collections;

public class Product {
	private int id;
	private String p_name;
	private String category;
	private double price;
	private int quantity;
	
	
	//constructor
	public Product(int id, String p_name,String category, double price, int quantity) {
		this.id=id;
		this.p_name=p_name;
		this.category=category;
		this.price=price;
		this.quantity=quantity;
	}
	
	//getter methods
	public int getId() {
		return id;
	}
	public String getPname() {
		return p_name;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	//display product details
	public void displayProduct() {
		System.out.println("ID: "+id+ ",Name: "+p_name+",Category: "+category+",Price: "+price+",Quantity: "+quantity);
	}

}
