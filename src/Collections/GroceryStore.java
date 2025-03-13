package Collections;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
	private List<Product> products=new ArrayList<>();
	private List<Customer> customers=new ArrayList<>();
	
	
	public GroceryStore() {
		products=new ArrayList<>();
		customers=new ArrayList<>();
	}
	
	//add product
	public void addproduct(Product p) {
		products.add(p);
		System.out.println("Product added: "+p.getPname());
	}
	
	//display product
	public void displayproducts() {
		System.out.println("\n Product List");
		for(Product p:products) {
			p.displayProduct();
		}
	}
	
	//add customer
	public void addcustomer(Customer c) {
		customers.add(c);
		System.out.println("Customer added: "+c.getCname());
	}
	
	//display customer
	public void displaycustomers() {
		System.out.println("\n Customer List");
		for(Customer c:customers) {
			c.displayCustomer();
		}
	}
	public static void main(String[] args) {
		GroceryStore store=new GroceryStore();
		
		//add product
		store.addproduct(new Product(1,"Tea","Bevrage",10, 8));
		store.addproduct(new Product(2,"Apple","Fruit",40, 5));
		
		
		//add customer
		store.addcustomer(new Customer(1,"Isha","isha@gmail.com","8976597654"));
		store.addcustomer(new Customer(2,"Muskan","muskan@gmail.com","8765678654"));
		
		
		//display
		store.displayproducts();
		store.displaycustomers();
	}
	
}
