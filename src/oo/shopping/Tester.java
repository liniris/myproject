package oo.shopping;

import java.util.ArrayList;

import oo.stati.Student;

public class Tester {

	public static void main(String[] args) {

		System.out.println("原價" + "\t" + "折扣後" + "\t" + "還原金");
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(8000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldCustomer(30000));
		list.add(new Customer(2000));
		list.add(new GoldCustomer(10000));
		//for (int i = 0; i < list.size(); i++) {
			//Customer cus = list.get(i);
		for(Customer cus:list){//for each迴圈,不需要index值時使用
			if(cus instanceof SilverCustomer && 
					!(cus instanceof GoldCustomer)){
				System.out.print("*");
				SilverCustomer silver = (SilverCustomer)cus;//轉型
			}
			cus.print();
		}
		
	}

}
