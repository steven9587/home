package customer;

import java.util.ArrayList;

public class Texter {

	public static void main(String[] args) {
	    /*
	    Customer c1 = new Customer(10000);
		c1.print();
		Customer c2 = new SilverCustomer(10000);
		c2.print();
		Customer c3 = new GoldenCustomer(10000);
		c3.print();
		*/
		ArrayList<Customer> customers = new ArrayList();
		Customer c1 = new Customer(10000);
		SilverCustomer c2 = new SilverCustomer(10000);
		GoldenCustomer c3 = new GoldenCustomer(10000);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		
		for (int i=0;i<customers.size();i++){
			Customer c = customers.get(i);
			c.print();
		}
	
	}

}
