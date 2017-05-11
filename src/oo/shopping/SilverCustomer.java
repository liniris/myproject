package oo.shopping;

public class SilverCustomer extends Customer {
	public SilverCustomer() {
		super();
	}

	float discount = 0.9f;

	public SilverCustomer(int money) {
		this.money = money;
	}

	public void print() {
		System.out.println(money + "\t" + discount * money + "\t" + "0");
	}
}
