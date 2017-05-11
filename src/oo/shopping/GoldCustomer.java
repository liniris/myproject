package oo.shopping;

public class GoldCustomer extends SilverCustomer {
	float returnRate = 0.05f;

	public GoldCustomer() {
		super();
	}

	public GoldCustomer(int money) {
		this.money = money;
	}

	public void print() {
		System.out.println(money + "\t" + discount * money + "\t" + returnRate * money);
	}
}
