package oo.shopping;

public class Customer {
	public Customer() {
		super();
	}

	int money;

	public Customer(int money) {
		this.money = money;
	}

	public void print() {
		System.out.println(money + "\t" + money + "\t" + "0");
	}
}
