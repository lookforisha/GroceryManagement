package Collections;

public class Customer {
	private int id;
	private String c_name;
	private String email;
	private String phone;
	
	
	//constructor
	public Customer(int id, String c_name, String email, String phone) {
		this.id=id;
		this.c_name=c_name;
		this.email=email;
		this.phone=phone;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCname() {
		return c_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	//display customer details
	public void displayCustomer() {
		System.out.println("ID: "+id+",Name: "+c_name+",Email: "+email+",Phone: "+phone);
	}
}
