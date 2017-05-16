package oo.shopping;

public class GoldCustomer extends SilverCustomer {
	float returnRate = 0.05f;

	public GoldCustomer(int money) {
		super(money);
	}

	@Override
	public void print() {
		System.out.println(money + "\t" + discount * money + "\t" + returnRate * money);
	}
}
