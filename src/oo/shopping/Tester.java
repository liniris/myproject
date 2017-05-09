package oo.shopping;

import java.util.ArrayList;

import oo.stati.Student;

public class Tester {

	public static void main(String[] args) {
		// Customer c1 = new Customer(6000);
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldCustomer(10000));
		for (int i = 0; i < list.size(); i++) {
			Customer cus = list.get(i);
			cus.print();
		}
	}

}
