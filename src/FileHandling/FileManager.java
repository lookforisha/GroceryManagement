package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Collections.Customer;

//handles serialization and deserialization of customer
public class FileManager {
	private static final String FILE_NAME="customer.obj";
	public static void saveCustomer(List<Customer> customers) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
			oos.writeObject(customers);
			System.out.println("Customer Data Saved");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void loadCustomer() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
			List<Customer> customers= (List<Customer>) ois.readObject();
			for(Customer c : customers) {
				c.displayCustomer();
			}
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}


