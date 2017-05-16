package oo.shopping;

public class SilverCustomer extends Customer {
	float discount = 0.9f;

	public SilverCustomer(int money) {
		super(money);
	}

	@Override
	public void print() {
		System.out.println(money + "\t" + discount * money + "\t" + "0");
	}
}
